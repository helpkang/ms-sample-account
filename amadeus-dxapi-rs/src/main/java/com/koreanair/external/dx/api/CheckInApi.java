package com.koreanair.external.dx.api;

import com.koreanair.external.dx.vo.AcceptanceReply;
import com.koreanair.external.dx.vo.BoardingPassDeliveryInput;
import com.koreanair.external.dx.vo.BoardingPassesReply;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.ContactReply;
import com.koreanair.external.dx.vo.ContactsListReply;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.FrequentFlyerCardReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardsListReply;
import com.koreanair.external.dx.vo.JourneyBaggageRequest;
import com.koreanair.external.dx.vo.JourneyBaggagesReply;
import com.koreanair.external.dx.vo.JourneyElementReply;
import com.koreanair.external.dx.vo.JourneyElementSeatReply;
import com.koreanair.external.dx.vo.JourneyElementsListReply;
import com.koreanair.external.dx.vo.JourneyPaymentAuthorizationReply;
import com.koreanair.external.dx.vo.JourneyPaymentAuthorizationRequest;
import com.koreanair.external.dx.vo.JourneyPaymentConfirmationRequest;
import com.koreanair.external.dx.vo.JourneyPaymentRequest;
import com.koreanair.external.dx.vo.JourneyReply;
import com.koreanair.external.dx.vo.JourneyRequest;
import com.koreanair.external.dx.vo.JourneyTravelerPostRequest;
import com.koreanair.external.dx.vo.JourneyUnpaidItemsReply;
import com.koreanair.external.dx.vo.JourneysListReply;
import com.koreanair.external.dx.vo.Messages;
import com.koreanair.external.dx.vo.PaymentRecordsReply;
import com.koreanair.external.dx.vo.RegulatoryDetailsAddRequest;
import com.koreanair.external.dx.vo.RegulatoryDetailsListReply;
import com.koreanair.external.dx.vo.RegulatoryDetailsReply;
import com.koreanair.external.dx.vo.ServiceItemRequest;
import com.koreanair.external.dx.vo.ServiceReply;
import com.koreanair.external.dx.vo.ServicesReply;
import com.koreanair.external.dx.vo.UpdateJourneyElementRequest;

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
public interface CheckInApi  {

    /**
     * Add Contacts in the journey.
     *
     * Add Contact(s) in the journey: Emails and/or Phones. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Contacts in the journey.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = ContactsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactsListReply addContactsToJourney(@PathParam("journeyId") String journeyId, List<Contact> postContactsBody);

    /**
     * Add a traveler&#39;s frequent flyer card to the journey
     *
     * Add a traveler&#39;s frequent flyer card to the journey for miles accrual. The traveler ID is taken from the Frequent Flyer Card that is given
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a traveler's frequent flyer card to the journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey or traveler with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardReply addFrequentFlyerCardToJourney(@PathParam("journeyId") String journeyId, FrequentFlyerCard frequentFlyerCard);

    /**
     * Add a frequent flyer card for the journey element (traveler on a flight)
     *
     * Add frequent flyer card in the journey element (traveler on a flight) for miles accrual
     *
     */
    @POST
    @Path("/checkin/journey-elements/{journeyElementId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a frequent flyer card for the journey element (traveler on a flight)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No traveler on flight with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardReply addFrequentFlyerCardToJourneyElement(@PathParam("journeyElementId") String journeyElementId, FrequentFlyerCard frequentFlyerCard);

    /**
     * Add baggages for several passengers in the journey
     *
     * Add baggages for several passengers in the journey. All the requests will be cumulated, meaning that if we send for instance (traveler1, 2 baggages), (travaler1, 1 baggage, hunting trophy) and (traveler1, 3 baggages), as a result traveler1 will have a total of 5 regular baggages and 1 special baggage of type \&quot;hunting trophy\&quot;.
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/baggages")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add baggages for several passengers in the journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JourneyBaggagesReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyBaggagesReply addJourneyBags(@PathParam("journeyId") String journeyId, List<JourneyBaggageRequest> postBaggagesBody);

    /**
     * Add regulatory details on a journey
     *
     * Add one or multiple regulatory details that are required for the travelers on this journey 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add regulatory details on a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of regulatory details already provided and missing", response = RegulatoryDetailsListReply.class),
        @ApiResponse(code = 206, message = "Partial success on the regulatory details update", response = RegulatoryDetailsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey or traveler with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryDetailsListReply addJourneyRegulatoryDetails(@PathParam("journeyId") String journeyId, List<RegulatoryDetailsAddRequest> addRegulatoryDetailsRequest);

    /**
     * Add services to a journey
     *
     * Add one or multiple services from the catalogue of services to the journey. 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add services to a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of services that are in the journey", response = ServicesReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ServicesReply addJourneyServices(@PathParam("journeyId") String journeyId, List<ServiceItemRequest> postServicesBody);

    /**
     * Add regulatory details
     *
     * Add one or multiple regulatory details that are required for the traveler on this journey 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add regulatory details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of regulatory details already provided and missing", response = RegulatoryDetailsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey or traveler with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryDetailsReply addRegulatoryDetails(@PathParam("journeyId") String journeyId, @PathParam("travelerId") String travelerId, RegulatoryDetailsAddRequest addRegulatoryDetailsRequest);

    /**
     * Add a new traveler to check-in
     *
     * Modify a journey integrating a traveler retrieving the necessary information from: - an existing journey. - a confirmed booking (record locator, e-ticket number, Frequent Flyer card). Departure date, Origin location code and Last name are information are not mandatory and used only to secure the access. 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/travelers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a new traveler to check-in", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JourneyReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyReply addTravelerToJourney(@PathParam("journeyId") String journeyId, JourneyTravelerPostRequest journeyRequest);

    /**
     * Set, confirm or update seat assignment for the passenger and flight combination
     *
     * Set, confirm or update seat assignment for the passenger and flight combination.
     *
     */
    @PATCH
    @Path("/checkin/journey-elements/{journeyElementId}/seat")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Set, confirm or update seat assignment for the passenger and flight combination", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = JourneyElementSeatReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No traveler on flight with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyElementSeatReply assignSeatToJourneyElement(@PathParam("journeyElementId") String journeyElementId, @QueryParam("seatNumber")String seatNumber);

    /**
     * Authorize the payment record
     *
     * Authorize a payment record, to be called after creating it, and before confirming it. Payment in Self-Service Check-In is a three step process, leveraging Amadeus Payment Platform First, a payment record must be created for the journey.   This payment record will contain only an ID and a Payment Transaction   The ID is used to correlate the three steps of the process   The Payment Transaction will contain only a Payment Request   The Payment Request will contain a Payment Method and an Amount   If the amount is equal to 0 (possible for a free change, or a redemption credit purchase for example), no further process is necessary   The Payment Method will be of type AlternativePaymentMethod   The AlternativePaymentMethod will contain only a dedicated name \&quot;SSCI_APP\&quot; and a status Next, if the amount is not 0 the payment must be authorized and confirmed   Authorization is done by calling the authorization controller on the relevant payment record, passing the method of payment data   (This authorization step can be reaplced with an integrated external payment system, e.g. prebuilt Amadeus Payment Pages) Finally, after authorization the payment must be confirmed   This is performed by calling a confirmation controller on the relevant payment record, passing the email address to be used for the payment receipt 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/payment-records/{paymentRecordId}/authorization")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Authorize the payment record", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The authorization reply", response = JourneyPaymentAuthorizationReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyPaymentAuthorizationReply authorizeJourneyPaymentRecord(@PathParam("journeyId") String journeyId, @PathParam("paymentRecordId") String paymentRecordId, JourneyPaymentAuthorizationRequest journeyPaymentAuthorizationInput);

    /**
     * Confirm the payment record
     *
     * Confirm a payment record, to be called after having authorized it. Payment in Self-Service Check-In is a three step process, leveraging Amadeus Payment Platform First, a payment record must be created for the journey.   This payment record will contain only an ID and a Payment Transaction   The ID is used to correlate the three steps of the process   The Payment Transaction will contain only a Payment Request   The Payment Request will contain a Payment Method and an Amount   If the amount is equal to 0 (possible for a free change, or a redemption credit purchase for example), no further process is necessary   The Payment Method will be of type AlternativePaymentMethod   The AlternativePaymentMethod will contain only a dedicated name \&quot;SSCI_APP\&quot; and a status Next, if the amount is not 0 the payment must be authorized and confirmed   Authorization is done by calling the authorization controller on the relevant payment record, passing the method of payment data   (This authorization step can be reaplced with an integrated external payment system, e.g. prebuilt Amadeus Payment Pages) Finally, after authorization the payment must be confirmed   This is performed by calling a confirmation controller on the relevant payment record, passing the email address to be used for the payment receipt 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/payment-records/{paymentRecordId}/confirmation")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Confirm the payment record", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The confirmed payment record", response = PaymentRecordsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public PaymentRecordsReply confirmJourneyPaymentRecord(@PathParam("journeyId") String journeyId, @PathParam("paymentRecordId") String paymentRecordId, JourneyPaymentConfirmationRequest journeyPaymentConfirmationInput);

    /**
     * Create a new payment record for this journey
     *
     * Create a new payment record for this journey. Payment can be requested for various processes, e.g. Unpaid ancillaries, Upgrade, Flight reshopping... Payment in Self-Service Check-In is a three step process, leveraging Amadeus Payment Platform First, a payment record must be created for the journey.   This payment record will contain only an ID and a Payment Transaction   The ID is used to correlate the three steps of the process   The Payment Transaction will contain only a Payment Request   The Payment Request will contain a Payment Method and an Amount   If the amount is equal to 0 (possible for a free change, or a redemption credit purchase for example), no further process is necessary   The Payment Method will be of type AlternativePaymentMethod   The AlternativePaymentMethod will contain only a dedicated name \&quot;SSCI_APP\&quot; and a status Next, if the amount is not 0 the payment must be authorized and confirmed   Authorization is done by calling the authorization controller on the relevant payment record, passing the method of payment data   (This authorization step can be reaplced with an integrated external payment system, e.g. prebuilt Amadeus Payment Pages) Finally, after authorization the payment must be confirmed   This is performed by calling a confirmation controller on the relevant payment record, passing the email address to be used for the payment receipt 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/payment-records")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new payment record for this journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The created payment record", response = PaymentRecordsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public PaymentRecordsReply createJourneyPaymentRecord(@PathParam("journeyId") String journeyId, JourneyPaymentRequest journeyPaymentInput);

    /**
     * Remove acceptance of a journey
     *
     * Remove acceptance of a journey, i.e. undo the check-in.
     *
     */
    @DELETE
    @Path("/checkin/journeys/{journeyId}/acceptance")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove acceptance of a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id.", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteAcceptanceFromJourney(@PathParam("journeyId") String journeyId);

    /**
     * Undo the check-in of a journey element
     *
     * Delete the acceptance (i.e. undo the check-in) of a traveler on a flight
     *
     */
    @DELETE
    @Path("/checkin/journey-elements/{journeyElementId}/acceptance")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Undo the check-in of a journey element", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Traveler Flight Info with that id.", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteAcceptanceFromJourneyElement(@PathParam("journeyElementId") String journeyElementId);

    /**
     * Remove a contact from a journey
     *
     * Remove a contact from a journey.
     *
     */
    @DELETE
    @Path("/checkin/journeys/{journeyId}/contacts/{contactId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a contact from a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey or service with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteJourneyContact(@PathParam("journeyId") String journeyId, @PathParam("contactId") String contactId);

    /**
     * Remove contacts from a journey
     *
     * Delete contacts from a journey.
     *
     */
    @DELETE
    @Path("/checkin/journeys/{journeyId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove contacts from a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteJourneyContacts(@PathParam("journeyId") String journeyId, @QueryParam("contactIds")List<String> contactIds);

    /**
     * Remove a service from a journey
     *
     * Delete a service from a journey.
     *
     */
    @DELETE
    @Path("/checkin/journeys/{journeyId}/services/{serviceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a service from a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey or service with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteJourneyService(@PathParam("journeyId") String journeyId, @PathParam("serviceId") String serviceId);

    /**
     * Remove services from a journey
     *
     * Delete services from a journey.
     *
     */
    @DELETE
    @Path("/checkin/journeys/{journeyId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove services from a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteJourneyServices(@PathParam("journeyId") String journeyId, @QueryParam("serviceIds")List<String> serviceIds);

    /**
     * Generate boarding passes
     *
     * Generate the boarding passes for all the passengers on all flights of the journey selected. According to the delivery method chosen the response could provide the document or be empty in case of it is an indirect delivery (i.e. email, sms). A list of traveler-flight-infos can be provided to generate the boarding passes only for those. 
     *
     */
    @POST
    @Path("/checkin/boarding-passes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate boarding passes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "A list of boarding passes", response = BoardingPassesReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No traveler on flight with that id, or no boarding pass for that traveler on flight", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public BoardingPassesReply generateBoardingPasses(BoardingPassDeliveryInput deliveryInstructions);

    /**
     * Get provided and required regulatory details for the journey
     *
     * Retrieve the regulatory details that were previously provided for all the travelers inside the journey. Also retrieve the regulatory details that are required (or still missing) to enable the check-in and fulfill the regulatory requirement of the travel. 
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get provided and required regulatory details for the journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of regulatory details already provided and missing per traveler inside the journey", response = RegulatoryDetailsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryDetailsListReply getJourneyRegulatoryDetails(@PathParam("journeyId") String journeyId);

    /**
     * Retrieve a service from a journey
     *
     * Retrieve a service currently present in the journey.
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/services/{serviceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a service from a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The requested service information", response = ServiceReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey or service with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ServiceReply getJourneyService(@PathParam("journeyId") String journeyId, @PathParam("serviceId") String serviceId);

    /**
     * Get services inside the journey
     *
     * Retrieve the services booked by the travelers of the journey 
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get services inside the journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of services that are in the journey", response = ServicesReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ServicesReply getJourneyServices(@PathParam("journeyId") String journeyId);

    /**
     * Retrieve unpaid items linked to a journey
     *
     * Retrieve a list of unpaid items (ancillary services, bags, seats) linked to the journey.
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/unpaid-items")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve unpaid items linked to a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The list of unpaid items linked to the journey", response = JourneyUnpaidItemsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyUnpaidItemsReply getJourneyUnpaidItems(@PathParam("journeyId") String journeyId);

    /**
     * Get provided and required regulatory details
     *
     * Retrieve the regulatory details that were previously provided for the traveler. Also retrieve the regulatory details that are required (or still missing) to enable the check-in and fulfill the regulatory requirement of the travel. 
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get provided and required regulatory details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of regulatory details already provided and missing", response = RegulatoryDetailsReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey or traveler with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryDetailsReply getRegulatoryDetails(@PathParam("journeyId") String journeyId, @PathParam("travelerId") String travelerId);

    /**
     * Remove baggages from a journey
     *
     * Remove one or more baggages from the a journey
     *
     */
    @DELETE
    @Path("/checkin/journeys/{journeyId}/baggages")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove baggages from a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id.", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void removeBaggagesFromJourney(@PathParam("journeyId") String journeyId, @QueryParam("baggageIds")List<String> baggageIds);

    /**
     * Remove traveler from a journey
     *
     * Remove traveler from a journey, i.e. ignore this traveler during the check-in operation
     *
     */
    @DELETE
    @Path("/checkin/journeys/{journeyId}/travelers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove traveler from a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 403, message = "Last passenger cannot be deleted from a journey.", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id.", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void removeTravelersFromJourney(@PathParam("journeyId") String journeyId, @QueryParam("travelerIds")List<String> travelerIds);

    /**
     * Request acceptance of a journey
     *
     * Requesting the acceptance of journey will check-in all the travelers on every flight associated to the journey. The acceptance is performed only if the travelers are allowed to check-in. 
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/acceptance")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Request acceptance of a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Acceptance status of the journey", response = AcceptanceReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AcceptanceReply requestAcceptanceOfJourney(@PathParam("journeyId") String journeyId, @QueryParam("areSecurityQuestionsAnswered")@DefaultValue("false") Boolean areSecurityQuestionsAnswered);

    /**
     * Check-in a traveler on flight
     *
     * Perform the check-in of a traveler on a flight (if the traveler is allowed to take it).
     *
     */
    @POST
    @Path("/checkin/journey-elements/{journeyElementId}/acceptance")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Check-in a traveler on flight", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Acceptance status of the traveler on flight", response = AcceptanceReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Traveler Flight Info with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AcceptanceReply requestAcceptanceOfJourneyElement(@PathParam("journeyElementId") String journeyElementId, @QueryParam("areSecurityQuestionsAnswered")@DefaultValue("false") Boolean areSecurityQuestionsAnswered);

    /**
     * Get acceptance (check-in) status of the a journey
     *
     * Get the acceptance status of a journey: either all traveler on flight are accepted, or none, or partially.
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/acceptance")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get acceptance (check-in) status of the a journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AcceptanceReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AcceptanceReply retrieveAcceptanceFromJourney(@PathParam("journeyId") String journeyId);

    /**
     * Get acceptance (check-in) status of a journey element
     *
     * Get the acceptance status of a journey element: the traveler is checked in (or not) on the flight
     *
     */
    @GET
    @Path("/checkin/journey-elements/{journeyElementId}/acceptance")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get acceptance (check-in) status of a journey element", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AcceptanceReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Traveler Flight Info with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AcceptanceReply retrieveAcceptanceFromJourneyElement(@PathParam("journeyElementId") String journeyElementId);

    /**
     * Retrieve contact information
     *
     * Retrieve contact information from a journey based on its id. There are two types of contact supported: phone, email. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/contacts/{contactId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve contact information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactReply retrieveContactFromJourney(@PathParam("journeyId") String journeyId, @PathParam("contactId") String contactId);

    /**
     * Retrieve contacts information
     *
     * Retrieve a list of contacts for a journey. There are two types of contact supported: phone, email. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve contacts information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactsListReply retrieveContactsFromJourney(@PathParam("journeyId") String journeyId);

    /**
     * Retrieve frequent flyer card information
     *
     * Retrieve frequent flyer card information associated to the journey element
     *
     */
    @GET
    @Path("/checkin/journey-elements/{journeyElementId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve frequent flyer card information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No traveler on flight with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardsListReply retrieveFrequentFlyerCardFromJourneyElement(@PathParam("journeyElementId") String journeyElementId);

    /**
     * Retrieve journey
     *
     * Retrieve a journey corresponding to the specified id.
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JourneyReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyReply retrieveJourney(@PathParam("journeyId") String journeyId);

    /**
     * Retrieve the list of baggages registered on this journey
     *
     * Retrieve the list of baggages registered on this journey
     *
     */
    @GET
    @Path("/checkin/journeys/{journeyId}/baggages")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve the list of baggages registered on this journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JourneyBaggagesReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyBaggagesReply retrieveJourneyBaggages(@PathParam("journeyId") String journeyId);

    /**
     * Retrieve information about traveler on flight
     *
     * Retrieve a specific journey element (traveler on a flight)
     *
     */
    @GET
    @Path("/checkin/journey-elements/{journeyElementId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve information about traveler on flight", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A traveler on flight", response = JourneyElementReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No JourneyElement with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyElementReply retrieveJourneyElement(@PathParam("journeyElementId") String journeyElementId);

    /**
     * Retrieve information about travelers on flights
     *
     * Retrieve all the journey element (traveler on a flight)rmation corresponding to a defined check-in journey. A JourneyElement stores the information related to the experience of the traveler getting on a plane (seat association, requested services, etc.). 
     *
     */
    @GET
    @Path("/checkin/journey-elements")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve information about travelers on flights", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of travelers on flights", response = JourneyElementsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyElementsListReply retrieveJourneyElements(@QueryParam("journeyId")String journeyId);

    /**
     * Retrieve journeys
     *
     * Retrieve the list of journeys available for check-in corresponding to a confirmed booking. A journey will contain the information about flights and travelers associated to the booking. In order to check-in the entire journey in one shot the operation to perform is POST /checkin/journey/{journeyId}/acceptance. It is possible to retrieve or modify the information corresponding to any traveler on the flights associated to the journey, choosing among the available operations of the resource JourneyElement. 
     *
     */
    @POST
    @Path("/checkin/journeys")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve journeys", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = JourneysListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneysListReply retrieveJourneys(JourneyRequest postJourneyBody);

    /**
     * Update the information about the traveler on the flight
     *
     * Update the traveler on the flight information.
     *
     */
    @PATCH
    @Path("/checkin/journey-elements/{journeyElementId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update the information about the traveler on the flight", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated journey element (traveler on a flight)", response = JourneyElementReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey or traveler with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public JourneyElementReply updateJourneyElement(@PathParam("journeyElementId") String journeyElementId, UpdateJourneyElementRequest updateJourneyElementRequest);

    /**
     * Update the voluntary denied boarding status of the journey
     *
     * Update the voluntary denied boarding status of the journey. In case of overbooking, are the traveller(s) on this journey volunteer(s) to surrender their place in exchange of compensation?
     *
     */
    @POST
    @Path("/checkin/journeys/{journeyId}/acceptance/voluntary-denied-boarding")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update the voluntary denied boarding status of the journey", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated acceptance", response = AcceptanceReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AcceptanceReply updateVoluntaryDeniedBoardingOnJourney(@PathParam("journeyId") String journeyId, Boolean desiredVoluntaryDeniedBoardingStatus);

    /**
     * Update the voluntary denied boarding status of the journey element
     *
     * Update the voluntary denied boarding status of the journey element. In case of overbooking, is the traveller(s) on this flight volunteer to surrender their place in exchange of compensation?
     *
     */
    @POST
    @Path("/checkin/journey-elements/{journeyElementId}/acceptance/voluntary-denied-boarding")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update the voluntary denied boarding status of the journey element", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated acceptance", response = AcceptanceReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 404, message = "No Journey with that id", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AcceptanceReply updateVoluntaryDeniedBoardingOnJourneyElement(@PathParam("journeyElementId") String journeyElementId, Boolean desiredVoluntaryDeniedBoardingStatus);
}

