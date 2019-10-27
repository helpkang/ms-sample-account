package com.koreanair.external.dx.api;

import com.koreanair.external.dx.vo.AlternativeOfferConfirmationReply;
import com.koreanair.external.dx.vo.AlternativeOfferConfirmationRequest;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.ContactReply;
import com.koreanair.external.dx.vo.ContactsListReply;
import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
import com.koreanair.external.dx.vo.FormOfIdentificationDetailListReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardRequest;
import com.koreanair.external.dx.vo.FrequentFlyerCardRequestsListReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardsListReply;
import com.koreanair.external.dx.vo.InsuranceItemsListReply;
import com.koreanair.external.dx.vo.Messages;
import com.koreanair.external.dx.vo.OrderPaymentConfirmRequest;
import com.koreanair.external.dx.vo.OrderPaymentRequest;
import com.koreanair.external.dx.vo.OrderPreviewsListReply;
import com.koreanair.external.dx.vo.OrderReply;
import com.koreanair.external.dx.vo.OrderSeatReply;
import com.koreanair.external.dx.vo.OrderSeatsReply;
import com.koreanair.external.dx.vo.OrderServiceReply;
import com.koreanair.external.dx.vo.OrderServicesReply;
import com.koreanair.external.dx.vo.OrdersListReply;
import com.koreanair.external.dx.vo.OtherServiceInformation;
import com.koreanair.external.dx.vo.OtherServiceInformationReply;
import com.koreanair.external.dx.vo.OtherServiceInformationsListReply;
import com.koreanair.external.dx.vo.PaymentRecordsReply;
import com.koreanair.external.dx.vo.PostOrderInsuranceRequest;
import com.koreanair.external.dx.vo.PostOrderRequest;
import com.koreanair.external.dx.vo.PostOrderSeatRequest;
import com.koreanair.external.dx.vo.PostOrderServiceRequest;
import com.koreanair.external.dx.vo.RegulatoryApisDetail;
import com.koreanair.external.dx.vo.RegulatoryApisDetailListReply;
import com.koreanair.external.dx.vo.Remark;
import com.koreanair.external.dx.vo.RemarkReply;
import com.koreanair.external.dx.vo.RemarksListReply;
import com.koreanair.external.dx.vo.SpecialKeyword;
import com.koreanair.external.dx.vo.SpecialKeywordReply;
import com.koreanair.external.dx.vo.SpecialKeywordsListReply;
import com.koreanair.external.dx.vo.SpecialServiceRequest;
import com.koreanair.external.dx.vo.SpecialServiceRequestReply;
import com.koreanair.external.dx.vo.SpecialServiceRequestsListReply;
import com.koreanair.external.dx.vo.TravelDocumentReply;
import com.koreanair.external.dx.vo.TravelDocumentsListReply;
import com.koreanair.external.dx.vo.TravelDocumentsRequest;
import com.koreanair.external.dx.vo.TravelerReply;
import com.koreanair.external.dx.vo.TravelersListReply;

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
public interface OrderApi  {

    /**
     * Add some regulatory information in the Order (APIS data).
     *
     * Add Advance Passenger Information regulatory details (passport, visa, residence or destination addresses) in the Order. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add some regulatory information in the Order (APIS data).", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = RegulatoryApisDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryApisDetailListReply addAPISToOrder(@PathParam("orderId") String orderId, @PathParam("travelerId") String travelerId, List<RegulatoryApisDetail> postAPISBody, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName);

    /**
     * Add Contacts in the order.
     *
     * Add Contact(s) in the order: Emails, Phones and/or Addresses. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Contacts in the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = ContactsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactsListReply addContactsToOrder(@PathParam("orderId") String orderId, List<Contact> postContactsBody, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName);

    /**
     * Add FOID information in the order.
     *
     * Add some Form of identification details (regulatory document, frequent flyer or payment card) in the order for a list of travelers. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/form-of-identification-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add FOID information in the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = FormOfIdentificationDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FormOfIdentificationDetailListReply addFOIDToOrder(@PathParam("orderId") String orderId, List<FormOfIdentificationDetail> postFOIDBody, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName);

    /**
     * Add Frequent flyer card in the order.
     *
     * Add frequent flyer card(s) in the order for miles accrual or servicing. A list of requests can be specified to either add new card or add a new usage to an existing card. To specify many usages for a same card, several requests needs to be created. For each card, several service requests (SSR) can be created in the order. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Frequent flyer card in the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = FrequentFlyerCardRequestsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardRequestsListReply addFrequentFlyerCardsToOrder(@PathParam("orderId") String orderId, List<FrequentFlyerCardRequest> postFrequentFlyerCardsBody, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName);

    /**
     * Add Insurances to the order.
     *
     * Add Insurance(s) (chosen from insurance availability) in the order. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/insurances")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Insurances to the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = InsuranceItemsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public InsuranceItemsListReply addInsurancesToOrder(@PathParam("orderId") String orderId, PostOrderInsuranceRequest postInsurancesBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Add Other Service Information(s) in the order.
     *
     * Add Other Service Information(s) in the order. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/other-service-informations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Other Service Information(s) in the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = OtherServiceInformationsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OtherServiceInformationsListReply addOtherServiceInformationsToOrder(@PathParam("orderId") String orderId, List<OtherServiceInformation> postOtherServiceInformationsBody, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName);

    /**
     * Add Remarks in the order.
     *
     * Add Remark(s) in the order: General Remarks, Corporate Remarks and/or Confidential Remarks. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/remarks")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Remarks in the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = RemarksListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RemarksListReply addRemarksToOrder(@PathParam("orderId") String orderId, List<Remark> postRemarksBody, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName);

    /**
     * Add seats to an order
     *
     * Add a seat (from the seatmap) to the order. Both chargeable and free items can be added. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/seats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add seats to an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = OrderSeatsReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrderSeatsReply addSeatsToOrder(@PathParam("orderId") String orderId, PostOrderSeatRequest postOrderSeatsBody, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Add services to an order
     *
     * Add services (chosen from the catalogue of services) to an order. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add services to an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = OrderServicesReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrderServicesReply addServicesToOrder(@PathParam("orderId") String orderId, PostOrderServiceRequest postOrderServicesBody, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Add Special Keyword(s) in the order.
     *
     * Add Special Keyword(s) in the order. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/special-keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Special Keyword(s) in the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = SpecialKeywordsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SpecialKeywordsListReply addSpecialKeywordsToOrder(@PathParam("orderId") String orderId, List<SpecialKeyword> postSpecialKeywordsBody, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName);

    /**
     * Add Special Service Request(s) in the order.
     *
     * Add generic Special Service Request(s) (SSR) in the order. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/special-service-requests")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Special Service Request(s) in the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = SpecialServiceRequestsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SpecialServiceRequestsListReply addSpecialServiceRequestsToOrder(@PathParam("orderId") String orderId, List<SpecialServiceRequest> postSpecialServiceRequestsBody, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName);

    /**
     * Cancel an order
     *
     * Cancel an unpaid order or an order with no associated travel documents. 
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void cancelOrder(@PathParam("orderId") String orderId, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName);

    /**
     * Update the order with the new flight selection from GET /search/alternative-offers
     *
     * Update the order with the new flight selection from GET /search/alternative-offers 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/alternative-offer-confirmation")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update the order with the new flight selection from GET /search/alternative-offers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = AlternativeOfferConfirmationReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AlternativeOfferConfirmationReply confirmAlternativeOffer(@PathParam("orderId") String orderId, AlternativeOfferConfirmationRequest alternativeOfferConfirmationRequest);

    /**
     * Performs the payment confirmation of the order after redirection.
     *
     * Controller used to perform the confirmation (after redirection) of the payment records associated to the specified order. This entry point performs several transactions: - Confirms and validates payment status based on the payment confirmation data sent in input. - Updates the payment records in the order - Create the travel documents (if configured to chain issuance after successful payment). The travel documents could also be created later by using POST purchase/orders/{orderId}/travel-documents. Payment Method is provided in the body of the request along with the payment confirmation data from the PSP.  Both AlternativePaymentMethod and PaymentCard enrolled for 3D Secure are supported. API will trigger the payment confirmation and travel documents issuance.  An error will be raised in the following cases: - The Order already contains confirmed payment records - The Order already contains travel documents 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/payment-records/confirmation")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Performs the payment confirmation of the order after redirection.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "A specific order with payment.", response = PaymentRecordsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public PaymentRecordsReply confirmPaymentRecords(@PathParam("orderId") String orderId, OrderPaymentConfirmRequest confirmPaymentRecordsBody, @QueryParam("lang")String lang);

    /**
     * Create an order
     *
     * The order is created from the cart content provided in input. Travel Documents can be issued. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/purchase/orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = OrdersListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrdersListReply createOrder(@QueryParam("cartId")String cartId, @QueryParam("lang")String lang, PostOrderRequest createOrderBody);

    /**
     * Performs the payment of the order.
     *
     * Performs the payment for the order. This entry point performs several transactions: - authorize the payment method for PaymentCard (based on configuration) - create the payment records in the order - return redirection URL (in case of AlternativePaymentMethod with redirection) - create the travel documents (if configured to chain issuance after successful payment). The travel documents could also be created later by using POST orders/{orderId}/travelDocuments. Payment Methods are provided in the HTTP body of the request. PaymentCard, ExternalPayment, MilesPayment and AlternativePaymentMethod are supported The API user can request: - the payment of an order: API will trigger the payment as well as issuance of all the order content. If there are any payment records (FP), travel documents or invalid order content, an error is raised. - the payment of specific seats and/or services in an order: the API user should in this case send the itemIds of seats/services that he wishes to pay. 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/payment-records")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Performs the payment of the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Payment records created and confirmed.", response = PaymentRecordsReply.class),
        @ApiResponse(code = 202, message = "Payment created but awaiting confirmation.", response = PaymentRecordsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public PaymentRecordsReply createPaymentRecords(@PathParam("orderId") String orderId, OrderPaymentRequest createPaymentRecordsBody, @QueryParam("lang")String lang);

    /**
     * Delete regulatory information from the order.
     *
     * Delete Advance Passenger Information regulatory details from the order for the given traveler.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete regulatory information from the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteAPISFromOrder(@PathParam("orderId") String orderId, @PathParam("travelerId") String travelerId, @QueryParam("regulatoryApisDetailIds")List<String> regulatoryApisDetailIds, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Delete a Contact from the order
     *
     * Delete a Contact from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/contacts/{contactId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a Contact from the order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteContactFromOrder(@PathParam("orderId") String orderId, @PathParam("contactId") String contactId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Delete Contacts from the order.
     *
     * Delete Contacts from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Contacts from the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteContactsFromOrder(@PathParam("orderId") String orderId, @QueryParam("contactIds")List<String> contactIds, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Delete the given FOID(s) from the order.
     *
     * Delete the form of Identification from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/form-of-identification-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete the given FOID(s) from the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteFOIDFromOrder(@PathParam("orderId") String orderId, @QueryParam("formOfIdentificationDetailIds")List<String> formOfIdentificationDetailIds, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Delete a frequent flyer card from the order
     *
     * Delete a frequent flyer card from the order. When deleting a card, all the service requests (miles accrual / servicing) associated to the card are removed.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/frequent-flyer-cards/{frequentFlyerCardId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a frequent flyer card from the order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteFrequentFlyerCardFromOrder(@PathParam("orderId") String orderId, @PathParam("frequentFlyerCardId") String frequentFlyerCardId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Delete Frequent flyer cards from the order.
     *
     * Delete Frequent flyer cards from the order. According the operation type, one or several service requests containing the card number can be deleted. 
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Frequent flyer cards from the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteFrequentFlyerCardsFromOrder(@PathParam("orderId") String orderId, @QueryParam("frequentFlyerCardsIds")List<String> frequentFlyerCardsIds, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Remove insurances from a an order
     *
     * Delete insurances from an order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/insurances")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove insurances from a an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteInsurancesFromOrder(@PathParam("orderId") String orderId, @QueryParam("insuranceIds")List<String> insuranceIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete an Other Service Information from the order
     *
     * Delete an Other Service Information from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/other-service-informations/{otherServiceInformationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an Other Service Information from the order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteOTherServiceInformationFromOrder(@PathParam("orderId") String orderId, @PathParam("otherServiceInformationId") String otherServiceInformationId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete Other Service Information(s) from the order.
     *
     * Delete Other Service Information(s) from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/other-service-informations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Other Service Information(s) from the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteOtherServiceInformationsFromOrder(@PathParam("orderId") String orderId, @QueryParam("otherServiceInformationIds")List<String> otherServiceInformationIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete payment records from Order.
     *
     * Performs the cancellation of all payment records in the Order. Payment records will be cancelled only in the following cases: - AlternativePaymentMethod with status \&quot;denied\&quot; or \&quot;error\&quot;. - PaymentCard enrolled for 3D Secure with no approval code. All payment records in the Order must comply with one of the cases above, otherwise, they will not be deleted and an error will be displayed. 
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/payment-records")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete payment records from Order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deletePaymentRecords(@PathParam("orderId") String orderId, @QueryParam("lang")String lang, @QueryParam("paymentRecordIds")List<String> paymentRecordIds);

    /**
     * Delete a Remark from the order
     *
     * Delete a Remark from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/remarks/{remarkId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a Remark from the order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteRemarkFromOrder(@PathParam("orderId") String orderId, @PathParam("remarkId") String remarkId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete Remarks from the order.
     *
     * Delete Remarks from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/remarks")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Remarks from the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteRemarksFromOrder(@PathParam("orderId") String orderId, @QueryParam("remarkIds")List<String> remarkIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete seat from an order
     *
     * Delete seat from an order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/seats/{seatId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete seat from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteSeatFromOrder(@PathParam("orderId") String orderId, @PathParam("seatId") String seatId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Remove seats from a an order
     *
     * Delete seats from an order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/seats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove seats from a an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteSeatsFromOrder(@PathParam("orderId") String orderId, @QueryParam("seatIds")List<String> seatIds, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Delete service from an order
     *
     * Delete service from an order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/services/{serviceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete service from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteServiceFromOrder(@PathParam("orderId") String orderId, @PathParam("serviceId") String serviceId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Remove services from a an order
     *
     * Delete services from an order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove services from a an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteServicesFromOrder(@PathParam("orderId") String orderId, @QueryParam("serviceIds")List<String> serviceIds, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Delete a Special Keyword from the order
     *
     * Delete a Special Keyword from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/special-keywords/{specialKeywordId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a Special Keyword from the order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteSpecialKeywordFromOrder(@PathParam("orderId") String orderId, @PathParam("specialKeywordId") String specialKeywordId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete Special Keyword(s) from the order.
     *
     * Delete Special Keyword(s) from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/special-keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Special Keyword(s) from the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteSpecialKeywordsFromOrder(@PathParam("orderId") String orderId, @QueryParam("specialKeywordIds")List<String> specialKeywordIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete a Special Service Request from the order
     *
     * Delete a Special Service Request from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/special-service-requests/{specialServiceRequestId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a Special Service Request from the order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteSpecialServiceRequestFromOrder(@PathParam("orderId") String orderId, @PathParam("specialServiceRequestId") String specialServiceRequestId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete Special Service Request(s) from the order.
     *
     * Delete Special  Service Request(s) from the order.
     *
     */
    @DELETE
    @Path("/purchase/orders/{orderId}/special-service-requests")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Special Service Request(s) from the order.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteSpecialServiceRequestsFromOrder(@PathParam("orderId") String orderId, @QueryParam("specialServiceRequestIds")List<String> specialServiceRequestIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve the list of orders associated to a frequent flyer card or travel document number.
     *
     * Retrieve the list of orders associated to a frequent flyer card or a travel document number. Either &#39;frequentFlyerCardNumber&#39; + &#39;companyCode&#39; or &#39;travelDocumentId&#39; + &#39;lastName&#39; are required. Each order preview contains the basic information extracted from a corresponding order: please use the GET /purchase/orders/{orderId} entry point for a full view of the order. In case of group PNR, only the traveler matching the input criteria is returned. 
     *
     */
    @GET
    @Path("/purchase/order-previews")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve the list of orders associated to a frequent flyer card or travel document number.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of order previews", response = OrderPreviewsListReply.class),
        @ApiResponse(code = 400, message = "Invalid inputs.", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrderPreviewsListReply getListOfOrderPreviews(@QueryParam("frequentFlyerCardNumber")String frequentFlyerCardNumber, @QueryParam("companyCode")String companyCode, @QueryParam("travelDocumentId")String travelDocumentId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Create the travel documents for a given order
     *
     * Create the travel documents by issuing ETKT (Electronic ticket) and [EMD](https://en.wikipedia.org/wiki/Electronic_Miscellaneous_Document). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/purchase/orders/{orderId}/travel-documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create the travel documents for a given order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = TravelDocumentsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelDocumentsListReply issueTravelDocuments(@PathParam("orderId") String orderId, @QueryParam("lang")String lang, TravelDocumentsRequest createTravelDocumentsBody);

    /**
     * Retrieve the regulatory information for a specific traveler from an Order (APIS data)
     *
     * Retrieve Advance Passenger Information regulatory details for a specific traveler from an Order. The data can contain the passport, the visa and/or the residence/destination address information. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve the regulatory information for a specific traveler from an Order (APIS data)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegulatoryApisDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryApisDetailListReply retrieveAPISFromOrder(@PathParam("orderId") String orderId, @PathParam("travelerId") String travelerId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve contact information
     *
     * Retrieve contact information from an order based on its id. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/contacts/{contactId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve contact information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactReply retrieveContactFromOrder(@PathParam("orderId") String orderId, @PathParam("contactId") String contactId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve contacts information
     *
     * Retrieve a list of contacts for an order based on the order id. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve contacts information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactsListReply retrieveContactsFromOrder(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve FOID data from an order
     *
     * Retrieve Form of Identification data from an order. The data can contain a regulatory document, a frequent flyer card or a payment card. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/form-of-identification-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve FOID data from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormOfIdentificationDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FormOfIdentificationDetailListReply retrieveFOIDFromOrder(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve frequent flyer card information
     *
     * Retrieve frequent flyer card information from an order based on its id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/frequent-flyer-cards/{frequentFlyerCardId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve frequent flyer card information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardReply retrieveFrequentFlyerCardFromOrder(@PathParam("orderId") String orderId, @PathParam("frequentFlyerCardId") String frequentFlyerCardId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve frequent flyer cards information
     *
     * Retrieve a list of frequent flyer cards from an order based on the order id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve frequent flyer cards information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardsListReply retrieveFrequentFlyerCardsFromOrder(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieves an order
     *
     * Retrieves an order based on its id. Ex : /purchase/orders/AB23ED. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A specific order.", response = OrderReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrderReply retrieveOrder(@PathParam("orderId") String orderId, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("showOrderEligibilities")@DefaultValue("false") Boolean showOrderEligibilities);

    /**
     * Retrieve an OSI element
     *
     * Retrieve an OSI element from an order based on its id. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/other-service-informations/{otherServiceInformationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve an OSI element", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OtherServiceInformationReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OtherServiceInformationReply retrieveOtherServiceInformationFromOrder(@PathParam("orderId") String orderId, @PathParam("otherServiceInformationId") String otherServiceInformationId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve OSI elements information
     *
     * Retrieve a list of OSI for an order based on the order id. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/other-service-informations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve OSI elements information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OtherServiceInformationsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OtherServiceInformationsListReply retrieveOtherServiceInformationsFromOrder(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve a specific remark
     *
     * Retrieve a remark from an order based on its id. There are three types of remarks: general, corporate and confidential. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/remarks/{remarkId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a specific remark", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RemarkReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RemarkReply retrieveRemarkFromOrder(@PathParam("orderId") String orderId, @PathParam("remarkId") String remarkId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve remarks data
     *
     * Retrieve a list of remarks for an order based on the order id. There are three types of remarks: general, corporate and confidential. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/remarks")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve remarks data", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RemarksListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RemarksListReply retrieveRemarksFromOrder(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve a specific seat from an order
     *
     * Retrieve a specific seat from an order. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/seats/{seatId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a specific seat from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderSeatReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrderSeatReply retrieveSeatFromOrder(@PathParam("orderId") String orderId, @PathParam("seatId") String seatId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve all seats from an order
     *
     * Retrieve the list of seats from an order. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/seats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all seats from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderSeatsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrderSeatsReply retrieveSeatsFromOrder(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve a specific service from an order
     *
     * Retrieve a service item from an order. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/services/{serviceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a specific service from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderServiceReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrderServiceReply retrieveServiceFromOrder(@PathParam("orderId") String orderId, @PathParam("serviceId") String serviceId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve all services from an order
     *
     * Retrieve a list of services from an order. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all services from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderServicesReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OrderServicesReply retrieveServicesFromOrder(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve SK information
     *
     * Retrieve an SK information from an order based on its id. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/special-keywords/{specialKeywordId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve SK information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SpecialKeywordReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SpecialKeywordReply retrieveSpecialKeywordFromOrder(@PathParam("orderId") String orderId, @PathParam("specialKeywordId") String specialKeywordId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve SK information
     *
     * Retrieve a list of contacts for an order based on the order id. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/special-keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve SK information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SpecialKeywordsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SpecialKeywordsListReply retrieveSpecialKeywordsFromOrder(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve SSR information
     *
     * Retrieve an SSR information from an order based on its id. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/special-service-requests/{specialServiceRequestId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve SSR information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SpecialServiceRequestReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SpecialServiceRequestReply retrieveSpecialServiceRequestFromOrder(@PathParam("orderId") String orderId, @PathParam("specialServiceRequestId") String specialServiceRequestId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve all specialServiceRequests from an order
     *
     * Retrieve all specialServiceRequests from an order based on order id. 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/special-service-requests")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all specialServiceRequests from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SpecialServiceRequestsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SpecialServiceRequestsListReply retrieveSpecialServiceRequestsFromOrder(@PathParam("orderId") String orderId, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName);

    /**
     * Retrieve a specific travel document for a given order
     *
     * Retrieve a travel documents associated to an order based on the order id and document id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/travel-documents/{travelDocumentId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a specific travel document for a given order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TravelDocumentReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelDocumentReply retrieveTravelDocument(@PathParam("orderId") String orderId, @PathParam("travelDocumentId") String travelDocumentId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve all travel documents for a given order
     *
     * Retrieve travel documents associated to an order based on the order id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/travel-documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all travel documents for a given order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TravelDocumentsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelDocumentsListReply retrieveTravelDocuments(@PathParam("orderId") String orderId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Retrieve all travelers from an order
     *
     * Retrieve all travelers from an order based on order id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/travelers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all travelers from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TravelersListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelersListReply retrieveTravelers(@PathParam("orderId") String orderId, @QueryParam("lang")String lang, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName);

    /**
     * Retrieve a specific traveler from an order
     *
     * Retrieve a traveler from an order based on its id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/purchase/orders/{orderId}/travelers/{travelerId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a specific traveler from an order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TravelerReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelerReply retrieveTravelersFromOrder(@PathParam("orderId") String orderId, @PathParam("travelerId") String travelerId, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Update a Contact in Order
     *
     * Update a Contact in the order. This operation allows a partial update of a contact. Limitations for any tpe of contact: - The contact type, category and purpose cannot be changed e.g. modify an email into a phone, or a phone business to a phone home. Limitations for Phones: - Only the countryPhoneExtension, the areaCode and the number can be modified. Limitations for Addresses: - The format of an address (structured or not) can not be changed. By updating an address content, the format is kept. All information that needs to be kept needs to be provided in input. 
     *
     */
    @PATCH
    @Path("/purchase/orders/{orderId}/contacts/{contactId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a Contact in Order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactReply updateContactInOrder(@PathParam("orderId") String orderId, @PathParam("contactId") String contactId, Contact patchContactBody, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Update Contacts information in an Order
     *
     * Update contacts in the order. This operation allows a partial update of some elements of the list. Limitations for any type of contact: - The contact type, category and purpose cannot be changed e.g. modify an email into a phone, or a phone business to a phone home. Limitations for Phones: - Only the countryPhoneExtension, the areaCode and the number can be modified. Limitations for Addresses: - The PNR format of an address in the PNR (structured or freetext address) is kept by updating any field of the address. 
     *
     */
    @PATCH
    @Path("/purchase/orders/{orderId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Contacts information in an Order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactsListReply updateContactsInOrder(@PathParam("orderId") String orderId, List<Contact> patchContactsBody, @QueryParam("lastName")String lastName, @QueryParam("firstName")String firstName, @QueryParam("lang")String lang);

    /**
     * Update an Other Service Information element (OSI)
     *
     * Update an Other Service Information in the order.  Limitations: - Airline code and passenger association cannot be changed. Only the freetext of the Other Service Information can be updated. 
     *
     */
    @PATCH
    @Path("/purchase/orders/{orderId}/other-service-informations/{otherServiceInformationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update an Other Service Information element (OSI)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OtherServiceInformationReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OtherServiceInformationReply updateOtherServiceInformationInOrder(@PathParam("orderId") String orderId, @PathParam("otherServiceInformationId") String otherServiceInformationId, OtherServiceInformation patchOtherServiceInformationBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Update OSI in an Order
     *
     * Update Other Service Informations in the order. This operation allows a partial update of some elements of the list. 
     *
     */
    @PATCH
    @Path("/purchase/orders/{orderId}/other-service-informations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update OSI in an Order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OtherServiceInformationsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public OtherServiceInformationsListReply updateOtherServiceInformationsInOrder(@PathParam("orderId") String orderId, List<OtherServiceInformation> patchOtherServiceInformationsBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Update a Remark
     *
     * Update a Remark in the order.  Limitations for all Remark type: - The remark type cannot be changed e.g. modify a GeneralRemark into a ConfidentialRemark.  Limitations for GeneralRemark: - The category cannot be changed - A GeneralRemark with passenger association cannot be updated to a GeneralRemark without passenger asssociation. It is however possible to update the passenger association with new values. - A GeneralRemarl with segment association cannot be updated to a GeneralRemark without segment association. It is however possible to update the segment association with new values.  Limitations for ConfidentialRemark: - The security options cannot be changed - A ConfidentialRemark with passenger association cannot be updated to a ConfidentialRemark without passenger asssociation. It is however possible to update the passenger association with new values.  Limitations for CorporateRemark: - A CorporateRemark with passenger association cannot be updated to a CorporateRemark without passenger asssociation. It is however possible to update the passenger association with new values. - A CorporateRemark with segment association cannot be updated to a CorporateRemark without segment association. It is however possible to update the segment association with new values. 
     *
     */
    @PATCH
    @Path("/purchase/orders/{orderId}/remarks/{remarkId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a Remark", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RemarkReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RemarkReply updateRemarkInOrder(@PathParam("orderId") String orderId, @PathParam("remarkId") String remarkId, Remark patchRemarkBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Update remarks in an Order
     *
     * Update remarks in the order. This operation allows a partial update of some elements of the list. 
     *
     */
    @PATCH
    @Path("/purchase/orders/{orderId}/remarks")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update remarks in an Order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RemarksListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RemarksListReply updateRemarksInOrder(@PathParam("orderId") String orderId, List<Remark> patchRemarksBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);
}

