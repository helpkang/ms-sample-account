package com.koreanair.external.dx.api;

import com.koreanair.external.dx.vo.Messages;
import com.koreanair.external.dx.vo.MilesCashSplitListReply;
import com.koreanair.external.dx.vo.PaymentCurrencyConversionProposalListReply;
import com.koreanair.external.dx.vo.PaymentCurrencyConversionProposalListRequest;
import com.koreanair.external.dx.vo.ValidatePaymentMethodsReply;
import com.koreanair.external.dx.vo.ValidatePaymentMethodsRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Amadeus Digital Experience API
 *
 * <p># API information The document aims at describing the Amadeus Digital Experience API.  Through Digital API, an end user is able to search air offers and related services, add all necessary information to complete a booking, display a seatmap and select seats, add traveler preferences such as meal and finally finalize a booking (creation of an order). API also allows retrieving an existing order. Since the API is REST, operations are not flow related.  ## CRUD operations We do our best to have all our URLs be [RESTful](http://en.wikipedia.org/wiki/Representational_state_transfer). Every endpoint (URL) may support one of five different http verbs. GET requests fetch information about an object, POST requests create objects, PUT requests update objects and DELETE requests will delete objects. PATCH [JSON Merge Patch](https://tools.ietf.org/html/rfc7396) requests perform partial updates.  ## Structure ### The envelope Every response is contained by an envelope. That is, each response has a predictable set of keys with which you can expect to interact: ```json {     \"warnings\": [         ...     ],     \"data\": {         ...     },     \"dictionaries\": {         ...     },     \"errors\": [         ...     ] } ``` #### ERRORS Error messages corresponding to functional blocking issues encountered when processing an operation. When at least one message has a level 'error' nothing has been processed so no 'data' are returned. In this case the HTTP status become 200 for POST (instead of 201) and DELETE (instead of 204).  #### WARNINGS Warning messages corresponding to non blocking issues encountered when processing an operation.  #### DATA The data key is the meat of the response. It contains all information regarding the resource requested.  #### DICTIONARIES Each dictionary contains: - localized data : it's possible to request for a specific code (e.g. location code) the translation in the language code specified as query parameter. The translation applies as well to the related information: in case of location code, type of location (airport or city), corresponding city (for airport location), state, country, etc.) - dictionarized data : information used on different parts of the message can be defined once and referenced via an id. It that case, the id makes the connection between dictionary and data information Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get).  ### Example of request/response When triggering an API operation it is interesting to evaluate the response (or the data model corresponding to the input body in case of POST). ``` GET /carts/{cartId}/travelers/{travelerId} HTTP/1.1 Accept: application/json ```  Multiple errors can occur in response to a single request. The list of error messages is provided by the server: ```json HTTP/1.1 400 Bad Request Content-Type: application/json {   \"errors\": [     {       \"code\": \"04926\",       \"source\": { \"pointer\": \"/names/0/lastName\" },       \"title\": \"INVALID DATA RECEIVED\"       \"detail\": \"must match \\\"^[A-Za-zÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬-ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¿][A-Za-zÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬-ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¿ -.]{1,69}$\\\"     },     {       \"code\": \"36986\",       \"source\": { \"pointer\": \"/0/dateOfBirth\" },       \"detail\": \"Date of birth '2018-07-01' should be in the past\",       \"title\": \"INVALID DATA RECEIVED\"     },   ] } ``` Note: example added for illustration only.  A few considerations on the error message structure: - The title communicates the type of problem encountered. - The code refers to an application-specific code representing the type of problem encountered. Code and title have a similar behaviour, since they communicate which is the problem type. However, it is suggested to rely on the code as a unique identifier. - The detail is used to provide information specific to this occurrence of the problem.  Message may use source to point to the top-level of the document (\"\"). The source member can also be used to indicate that the error originated from a problem with a URI query parameter (parameter field used instead of pointer in that case).  Standard [HTTP response status codes](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes) apply. As such they are not all mentioned below.  ## Top resources ### Cart The central resource is the `Cart` (shopping cart) used at shopping time to prepare a journey (shopping, booking and pricing) and later on to perform servicing on an already booked reservation. A `Cart` gather `AirOffer`s, `Traveler`s as well as `Service`s, `Seat`s, `FrequentFlyerCard`s and `Contact`s. It can be associated to zero, one or more users. At checkout time, an `Order` is created based on content selected from the `Cart`.  ### AirCalendar `Air Calendar` provides the best price per day based on input parameters.  ### AirBound `Air Bound` provides the bound-by-bound shopping proposal based on input parameters. ### AirOffer An `Air Offer` is the result of a shopping proposal. It is a collection of `OfferItem`s, each offer item containing flights.  ### Service The ``Service`` resource allows to access the list of free and/or chargeable services.  ### Seatmap ``Seatmap`` refers to display of the air seat map, allowing the end user to identify the seat to be booked for free or at a charge.  ### Order An ``Order`` corresponds to a reservation record (Amadeus PNRs). The order can contain flights, services and seats, as well as travel documents (E-Tickets and/or EMDs) in case the order has been paid and related tickets issued.  ### Payment Method A `Payment Method` refers to a payment method that be used to pay an order. The following payment methods are supported by DAPI: Payment cards, External  payment, Miles payment and Alternative Payment Method.  ## Secondary resources (main ones) ### Traveler A ``Traveler`` is an individual involved in the booking and taking part in a journey. ### Seat A ``Seat`` refers to the seat that the end user can select as part of the booking. ### Frequent Flyer ``Frequent Flyer`` contains frequent flyer cards either to accrue miles or redeem miles (only accrual supported initially). ### Contact ``Contact`` refers to emails, phone numbers and addresses. ### Travel Document A ``Travel Document`` refers to the tickets (E-Tickets and/or EMDs) issued for flights or services. ### Payment Record A `Payment Record` contains the details of the payment transaction for an order. It includes the payment method used for the order payment, as well additional information such as the approval code for a Credit Card payment. ## Limitations - Only air related content booking is supported. - Only one order is created at a time from the cart. - A cart can only contain one single airOffer.  ## Miscellaneous ### Temporary id (tid) A temporary id (``tid``) can be used to: - identify an object in the request of a POST operation when the id of the object is not known yet.  - identify an object in the response of a PUT operation when the id of the object is changing.  In all cases, a tid is only valid for the time of the transaction   ### Output filtering JSON output can be filtered using ``-fields`` and ``fields`` query parameters, followed by the fully qualified name of the attribute to filter/keep.  Optionally the ``keepRequiredFields`` boolean query parameter can be used to avoid filtering required fields out.  Examples: ``` GET /carts/{cartId}?-fields=data.travelers ``` will filter all travelers out of the response ``` GET /carts/{cartId}?fields=data.travelers.age ``` will keep only age of the travelers in response  Any questions, suggestions or feedbacks, thank you for contacting the DxAPI team  ### Traceability token For better traceability of requests, a traceability token can and should be added to every call to the API.  This token is composed of both a session part and a request part resulting in a unique ID for a single request.  This opens the door for: - Easy retrieval of information regarding that request. - Linking the request to other requests performed in the same user session.  This traceability token is materialized by an ``Ama-Client-Ref`` header to be sent in each and every request.  This header must be formatted as following: ``${SESSION_ID}:${REQUEST_ID}``.  Where: - ``SESSION_ID``: is a client-side generated token identifying the client-side user session matching following regular expression ``[a-zA-Z0-9-]{10,48}``. A recommended way is to implement it as an [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) in [RFC 4122](https://tools.ietf.org/html/rfc4122) format.    - For example: ``123e4567-e89b-12d3-a456-426655440000``  - ``REQUEST_ID`` is a client-side request id within the client-side user session matching the ``[a-zA-Z0-9]{1,10}`` format.    - For example: ``1``, ``42``, ``5fa2``, ``Px2z5``, ...    - There is no notion of order between two ``REQUEST_ID``    - ``REQUEST_ID`` must be unique within a session.   Examples:  - Request ``2fc0`` within session ``123e4567-e89b-12d3-a456-426655440000`` traceability token:  ``Ama-Client-Ref: 123e4567-e89b-12d3-a456-426655440000:2fc0``     - Request ``7ba19e`` within session ``123e4567-e89b-12d3-a456-426655440000`` traceability token:  ``Ama-Client-Ref: 123e4567-e89b-12d3-a456-426655440000:7ba19e`` 
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface PaymentApi  {

    /**
     * Retrieve currency conversion proposals.
     *
     * There are two types of currency conversion available: Dynamic Currency Conversion (DCC): the currency used corresponds to the one associated to the credit card Multiple Currency Proposal (MCP): the conversion is done against a list of currencies as defined by APP (Amadeus Payment Platform) http://www.amadeus.com/airlineit/solutions/sol_2stand_4payment_7currencyconverter.html 
     *
     */
    @POST
    @Path("/purchase/payment-methods/alternative-currency-payment")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve currency conversion proposals.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of possible currency conversion Proposals.", response = PaymentCurrencyConversionProposalListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public PaymentCurrencyConversionProposalListReply getPaymentCurrencyConversionProposals(PaymentCurrencyConversionProposalListRequest getcurrencyConversionProposalsBody, @QueryParam("lang")String lang);

    /**
     * Retrieve proposals to split the payment between Miles and Cash when using the payment method MilesPayment.
     *
     * This method provides a list of Miles and Cash splits for a given cart or order. A cartId or an orderId must be provided for which the list of Miles and Cash splits will be provided. Each split describes a combination of monetary and miles amounts that together can be used when choosing Miles &amp; Cash payment The result will always contain at least 2 splits:  - The first split in the list is the one where a minimal amount is paid using miles.  - The last split in the list is the one where the highest possible amount is paid using miles. The highest possible amount can still contain a monetary amount (if the airline does not convert taxes, fees etc.) Splits that are in between first and last, if exist, will follow the progression from minimum to maximum miles amount.  All splits in the result:  - The miles amount is always a whole number, which denotes the number of miles used when paying with this option.  - The monetary amounts are always given in the currency of the given cart or order.     - convertedAmount: By redeeming miles, the monetary amount has been reduced by this amount.     - nonConvertedAmount: This amount will not be paid in miles, it denotes the amount to be paid using a monetary payment method, e.g. Credit Card.  By referencing a Frequent Flyer Card (that was previously added to the cart or order) using frequentFlyerCardId, you can benefit from more accurate results for Frequent Flyer benefits. The referenced Frequent Flyer Card should be the one that will later be used by the Miles &amp; Cash payment method. If there is no Frequent Flyer information available (yet), the Miles &amp; Cash options are calculated using the default Frequent Flyer program and tier level. 
     *
     */
    @GET
    @Path("/purchase/payment-methods/miles-payment")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve proposals to split the payment between Miles and Cash when using the payment method MilesPayment.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of possible payment options when using the Miles & Cash payment method.", response = MilesCashSplitListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public MilesCashSplitListReply getPaymentMethodMilesCash(@QueryParam("cartId")String cartId, @QueryParam("orderId")String orderId, @QueryParam("frequentFlyerCardId")String frequentFlyerCardId, @QueryParam("lang")String lang);

    /**
     * Get payment method(s) and split payment options that can be used to pay
     *
     * This entry point returns the list of payment methods available to  pay the order provided in input, as well the remaining amount to  pay.  The following PaymentMethods are supported:  - PaymentCard - ExternalPayment - MilesPayment - AlternativePaymentMethod  ----- ### Split payment In case the API user wishes to split the payment across several payment methods, the API user can send one or several payment  methods with an associated amount in the body and the API will  return the remaining amount to pay if the payment methods do not  cover the full amount to be paid, and a summary of what will be  charged on each provided payment methods.  The following combinations of PaymentMethod for Split Payment are  supported: - PaymentCard and MilesPayment  - ExternalPayment and MilesPayment ----- ### PaymentCard In case the PaymentMethod sent in input is a PaymentCard, the API  returns  the amount covered by the card as well as the card fees  that will apply if the user proceeds with the payment later on. ----- ### Note  This is just an informative entry point: it does NOT trigger any payment transaction (authorization, debit, etc.). 
     *
     */
    @POST
    @Path("/purchase/payment-methods")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get payment method(s) and split payment options that can be used to pay", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Details and payment options available for the provided payment methods.", response = ValidatePaymentMethodsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ValidatePaymentMethodsReply searchAndValidatePaymentMethods(ValidatePaymentMethodsRequest createPaymentRecordsBody, @QueryParam("lang")String lang);
}

