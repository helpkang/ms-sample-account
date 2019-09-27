package com.koreanair.external.dx.api;

import com.koreanair.external.dx.vo.AirOfferReply;
import com.koreanair.external.dx.vo.AirOfferSelectionRequest;
import com.koreanair.external.dx.vo.AirOffersInCartReply;
import com.koreanair.external.dx.vo.CartReply;
import com.koreanair.external.dx.vo.CartRequest;
import com.koreanair.external.dx.vo.CloneCartRequest;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.ContactReply;
import com.koreanair.external.dx.vo.ContactsListReply;
import com.koreanair.external.dx.vo.Extension;
import com.koreanair.external.dx.vo.ExtensionListReply;
import com.koreanair.external.dx.vo.ExtensionReply;
import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
import com.koreanair.external.dx.vo.FormOfIdentificationDetailListReply;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.FrequentFlyerCardReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardsListReply;
import com.koreanair.external.dx.vo.HotelOffersListReply;
import com.koreanair.external.dx.vo.HotelOffersSelectionRequest;
import com.koreanair.external.dx.vo.Messages;
import com.koreanair.external.dx.vo.RegulatoryApisDetail;
import com.koreanair.external.dx.vo.RegulatoryApisDetailListReply;
import com.koreanair.external.dx.vo.SeatItemRequest;
import com.koreanair.external.dx.vo.SeatReply;
import com.koreanair.external.dx.vo.SeatsReply;
import com.koreanair.external.dx.vo.ServiceItemRequest;
import com.koreanair.external.dx.vo.ServiceReply;
import com.koreanair.external.dx.vo.ServicesReply;
import com.koreanair.external.dx.vo.Traveler;
import com.koreanair.external.dx.vo.TravelerReply;
import com.koreanair.external.dx.vo.TravelersListReply;
import com.koreanair.external.dx.vo.UpdateCartRequest;
import com.koreanair.external.dx.vo.UpdateSeatItemRequest;
import com.koreanair.external.dx.vo.UpdateSeatItemsRequest;
import com.koreanair.external.dx.vo.UpdateServiceItemRequest;
import com.koreanair.external.dx.vo.UpdateServiceItemsRequest;

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
public interface CartApi  {

    /**
     * Add regulatory information in the Cart.
     *
     * Add some Advance Passenger Information details (regulatory documents or addresses) in the Cart for a given traveler. 
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add regulatory information in the Cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = RegulatoryApisDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryApisDetailListReply addAPISsToCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, List<RegulatoryApisDetail> postAPISBody, @QueryParam("lang")String lang);

    /**
     * Add an air offer to the cart
     *
     * Add an airOffer to a given cart. An offer can be added in the cart either from an airOffer ID or from a list of bound IDs (inputs are mutually exclusive). In that case an offer containing these bounds is created. When adding an air offer in the cart, a list of traveler sub-resources are created automatically. The created sub-resources contain only the assigned id and the passenger type code (PTC) corresponding to the ones selected when performing the air offer search. Example: if the air offer has been computed for 1 adult and 2 children, then 1 adult and 2 children travelers will be created accordingly. In case the cart contains already travelers, only the missing travelers will be created and a matching based on the PTC is done to associate these travelers to the offer. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/air-offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add an air offer to the cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = AirOffersInCartReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AirOffersInCartReply addAirOfferToCart(@PathParam("cartId") String cartId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang, AirOfferSelectionRequest postAirOfferBody);

    /**
     * Add FOID information in the cart.
     *
     * Add some Form of identification details (regulatory document or frequent flyer) in the cart for a list of travelers. The payment card is currently not available to be stored in the cart. For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/form-of-identification-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add FOID information in the cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = FormOfIdentificationDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FormOfIdentificationDetailListReply addFOIDsToCart(@PathParam("cartId") String cartId, List<FormOfIdentificationDetail> postFOIDsBody, @QueryParam("lang")String lang);

    /**
     * Add one or several hotel offers to the cart
     *
     * Add one or several hotel offers to a given cart. The list of added HotelOffers is returned. 
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/hotel-offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add one or several hotel offers to the cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = HotelOffersListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public HotelOffersListReply addHotelOffersToCart(@PathParam("cartId") String cartId, List<HotelOffersSelectionRequest> postHotelOfferBody, @QueryParam("lang")String lang);

    /**
     * Add seats to a cart
     *
     * Add seats (from the seatmap) to the cart. 
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/seats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add seats to a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = SeatsReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SeatsReply addSeatsToCart(@PathParam("cartId") String cartId, List<SeatItemRequest> postSeatsBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Add services to a cart
     *
     * Add a service (chosen from the catalogue of services) to the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add services to a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ServicesReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ServicesReply addServicesToCart(@PathParam("cartId") String cartId, List<ServiceItemRequest> postServicesBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Create a new cart from existing order
     *
     * Create copy of a cart from a given order
     *
     */
    @POST
    @Path("/shopping/carts/cloning")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new cart from existing order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = CartReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public CartReply cloneCart(CloneCartRequest postCloneCartBody, @QueryParam("lastName")String lastName);

    /**
     * Create a cart
     *
     * Create an empty cart, or a cart containing the information provided in input:   - An air offer can be added in the cart specifying its id or a complete list of bound IDs via the &#39;airOfferId&#39; / &#39;airBoundIds&#39; query parameters   - A list of sub-resources (such as Travelers, Contacts, Frequent flyer cards) can be specified in input using the &#39;CartRequest&#39; body parameter   - When relevant, the sub-resources can be associated using temporary ids. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/shopping/carts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = CartReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public CartReply createCart(@QueryParam("lang")String lang, CartRequest postCartBody);

    /**
     * Add contact information to a cart
     *
     * Add contact to the cart. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add contact information to a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ContactsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactsListReply createContactsInCart(@PathParam("cartId") String cartId, List<Contact> postContactsBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Add extensions to a cart
     *
     * Add extensions to the cart.  
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/extensions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add extensions to a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ExtensionListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ExtensionListReply createExtensionsInCart(@PathParam("cartId") String cartId, List<Extension> postExtensionsBody, @QueryParam("lastName")String lastName);

    /**
     * Add frequent flyer cards information to a cart
     *
     * Add frequent flyer cards to the cart.
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add frequent flyer cards information to a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = FrequentFlyerCardsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardsListReply createFrequentFlyerCardsInCart(@PathParam("cartId") String cartId, List<FrequentFlyerCard> postFrequentFlyerCardsBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Create one or several travelers(s)
     *
     * Create one or several travelers(s), i.e. individual traveling, and add them to a given cart. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @POST
    @Path("/shopping/carts/{cartId}/travelers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create one or several travelers(s)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = TravelersListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelersListReply createTravelersInCart(@PathParam("cartId") String cartId, List<Traveler> postTravelersBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete regulatory from the cart.
     *
     * Delete specific regulatory details for Advance Passenger Information data from the Cart for the given traveler.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}/regulatory-details/{regulatoryApisDetailId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete regulatory from the cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteAPISFromCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, @PathParam("regulatoryApisDetailId") String regulatoryApisDetailId, @QueryParam("lang")String lang);

    /**
     * Delete regulatory information from the Cart.
     *
     * Delete the given Advance Passenger Information (regulatory document or address) from the Cart for the given traveler.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete regulatory information from the Cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteAPISsFromCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, @QueryParam("regulatoryApisDetailIds")List<String> regulatoryApisDetailIds, @QueryParam("lang")String lang);

    /**
     * Remove a specific offer from a cart
     *
     * Delete offer from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/air-offers/{airOfferId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a specific offer from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteAirOfferFromCart(@PathParam("cartId") String cartId, @PathParam("airOfferId") String airOfferId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete a contact
     *
     * Delete a contact from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/contacts/{contactId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a contact", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteContactFromCart(@PathParam("cartId") String cartId, @PathParam("contactId") String contactId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Remove contacts from a cart
     *
     * Delete contacts from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove contacts from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteContactsFromCart(@PathParam("cartId") String cartId, @QueryParam("contactIds")List<String> contactIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete an extension from a cart
     *
     * Delete an extension from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/extensions/{extensionId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an extension from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteExtension(@PathParam("cartId") String cartId, @PathParam("extensionId") String extensionId, @QueryParam("lastName")String lastName);

    /**
     * Delete FOID(s) from the cart.
     *
     * Delete the given Form of Identification from the cart based on its id. For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/form-of-identification-details/{formOfIdentificationDetailId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete FOID(s) from the cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteFOIDFromCart(@PathParam("cartId") String cartId, @PathParam("formOfIdentificationDetailId") String formOfIdentificationDetailId, @QueryParam("lang")String lang);

    /**
     * Delete FOID(s) from the cart.
     *
     * Delete the given Form of Identification from the cart
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/form-of-identification-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete FOID(s) from the cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteFOIDsFromCart(@PathParam("cartId") String cartId, @QueryParam("formOfIdentificationDetailIds")List<String> formOfIdentificationDetailIds, @QueryParam("lang")String lang);

    /**
     * Delete a frequent flyer card.
     *
     * Delete a frequent flyer card from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/frequent-flyer-cards/{frequentFlyerCardId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a frequent flyer card.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteFrequentFlyerCardFromCart(@PathParam("cartId") String cartId, @PathParam("frequentFlyerCardId") String frequentFlyerCardId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Remove frequent flyer cards from a cart
     *
     * Delete frequent flyer cards from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove frequent flyer cards from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteFrequentFlyerCardsFromCart(@PathParam("cartId") String cartId, @QueryParam("frequentFlyerCardIds")List<String> frequentFlyerCardIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Remove a specific hotel offer from a cart
     *
     * Delete the hotel offer corresponding to the given hotelOfferId from a cart. 
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/hotel-offers/{hotelOfferId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove a specific hotel offer from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteHotelOfferFromCart(@PathParam("cartId") String cartId, @PathParam("hotelOfferId") String hotelOfferId, @QueryParam("lang")String lang);

    /**
     * Remove hotel offers from a cart
     *
     * Delete hotel offers from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/hotel-offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove hotel offers from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteHotelOffersFromCart(@PathParam("cartId") String cartId, @QueryParam("hotelOfferIds")List<String> hotelOfferIds, @QueryParam("lang")String lang);

    /**
     * Delete seat from a cart
     *
     * Delete seat from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/seats/{seatId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete seat from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteSeatFromCart(@PathParam("cartId") String cartId, @PathParam("seatId") String seatId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Remove seats from a cart
     *
     * Delete seats from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/seats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove seats from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteSeatsFromCart(@PathParam("cartId") String cartId, @QueryParam("seatIds")List<String> seatIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete service from a cart
     *
     * Delete service from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/services/{serviceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete service from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteServiceFromCart(@PathParam("cartId") String cartId, @PathParam("serviceId") String serviceId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Remove services from a cart
     *
     * Delete services from a cart.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove services from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteServicesFromCart(@PathParam("cartId") String cartId, @QueryParam("serviceIds")List<String> serviceIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Delete a traveler.
     *
     * Delete a traveler from a cart. A traveler associated to an offer can not be deleted. Please consider that all sub-resources (i.e. Contacts, Frequent Flyer, etc.) associated to the traveler will be removed from cart as well. 
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a traveler.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteTravelerFromCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Remove travelers from a cart
     *
     * Delete travelers from a cart. A traveler associated to an offer can not be deleted.
     *
     */
    @DELETE
    @Path("/shopping/carts/{cartId}/travelers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove travelers from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 404, message = "Not found", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public void deleteTravelersFromCart(@PathParam("cartId") String cartId, @QueryParam("travelerIds")List<String> travelerIds, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Partial update of a contact
     *
     * Update one or more fields associated to a contact in a cart. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/contacts/{contactId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Partial update of a contact", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactReply patchContactInCart(@PathParam("cartId") String cartId, @PathParam("contactId") String contactId, Contact patchContactBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Partial update of the contacts
     *
     * Update one or more fields associated to the contacts in a cart. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Partial update of the contacts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactsListReply patchContactsInCart(@PathParam("cartId") String cartId, List<Contact> patchContactsBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Partial update of a frequent flyer card
     *
     * Update one or more fields associated to a frequent flyer card in a cart.
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/frequent-flyer-cards/{frequentFlyerCardId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Partial update of a frequent flyer card", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardReply patchFrequentFlyerCardInCart(@PathParam("cartId") String cartId, @PathParam("frequentFlyerCardId") String frequentFlyerCardId, FrequentFlyerCard patchFrequentFlyerCardBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Partial update of frequent flyer cards information
     *
     * Update one or more fields associated to the frequent flyer cards in a cart.
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Partial update of frequent flyer cards information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardsListReply patchFrequentFlyerCardsInCart(@PathParam("cartId") String cartId, List<FrequentFlyerCard> patchFrequentFlyerCardsBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Update a seat in a cart
     *
     * Update a seat currently stored in the cart. 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/seats/{seatId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a seat in a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SeatReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SeatReply patchSeatFromCart(@PathParam("cartId") String cartId, @PathParam("seatId") String seatId, UpdateSeatItemRequest patchSeatBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Partial update of existing seats in cart
     *
     * Partial update of seats in the cart. 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/seats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Partial update of existing seats in cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SeatsReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SeatsReply patchSeatsInCart(@PathParam("cartId") String cartId, List<UpdateSeatItemsRequest> patchSeatsBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Update a service from a cart
     *
     * Update a service currently stored in the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/services/{serviceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a service from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ServiceReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ServiceReply patchServiceFromCart(@PathParam("cartId") String cartId, @PathParam("serviceId") String serviceId, UpdateServiceItemRequest patchServiceBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Partial update of existing services in cart
     *
     * Partial update of existing services in the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Partial update of existing services in cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ServicesReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ServicesReply patchServicesInCart(@PathParam("cartId") String cartId, List<UpdateServiceItemsRequest> patchServicesBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Partial update of a traveler
     *
     * Update one or more attributes of a traveler in a cart. The passenger type code (PTC) of a traveler associated to an offer can not be modified. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Partial update of a traveler", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TravelerReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelerReply patchTravelerInCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, Traveler patchTravelerBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Partial update of travelers
     *
     * Update one or more fields associated to the travelers in a cart. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/travelers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Partial update of travelers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TravelersListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelersListReply patchTravelersInCart(@PathParam("cartId") String cartId, List<Traveler> patchTravelersBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve a specific regulatory information for a specific traveler from a Cart
     *
     * Retrieve specific regulatory details for Advance Passenger Information for a specific traveler from a Cart. The data can contain a regulatory document or an address. 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}/regulatory-details/{regulatoryApisDetailId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a specific regulatory information for a specific traveler from a Cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegulatoryApisDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryApisDetailListReply retrieveAPISFromCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, @PathParam("regulatoryApisDetailId") String regulatoryApisDetailId, @QueryParam("lang")String lang);

    /**
     * Retrieve an offer
     *
     * Retrieve an offer from a cart based on its id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/air-offers/{airOfferId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve an offer", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AirOfferReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AirOfferReply retrieveAirOfferFromCart(@PathParam("cartId") String cartId, @PathParam("airOfferId") String airOfferId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve all offers from a cart
     *
     * Retrieve all AirOffers from a Cart based on cart id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/air-offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all offers from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AirOffersInCartReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public AirOffersInCartReply retrieveAirOffersFromCart(@PathParam("cartId") String cartId);

    /**
     * Retrieve shopping cart
     *
     * Retrieve a cart  based on its cart id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve shopping cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CartReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public CartReply retrieveCart(@PathParam("cartId") String cartId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang, @QueryParam("refresh")@DefaultValue("false") Boolean refresh);

    /**
     * Retrieve contact information
     *
     * Retrieve contact information from a cart based on its id. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/contacts/{contactId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve contact information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactReply retrieveContactFromCart(@PathParam("cartId") String cartId, @PathParam("contactId") String contactId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve contact information
     *
     * Retrieve a list of contacts for a cart based on the cart id. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve contact information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ContactsListReply retrieveContactsFromCart(@PathParam("cartId") String cartId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve an extension
     *
     * 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/extensions/{extensionId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve an extension", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ExtensionReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ExtensionReply retrieveExtensionFromCart(@PathParam("cartId") String cartId, @PathParam("extensionId") String extensionId, @QueryParam("lastName")String lastName);

    /**
     * Retrieve all extensions
     *
     * Retrieve all extensions. 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/extensions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all extensions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ExtensionListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ExtensionListReply retrieveExtensionsFromCart(@PathParam("cartId") String cartId, @QueryParam("lastName")String lastName);

    /**
     * Retrieve FOID data from a cart based on its id.
     *
     * Retrieve Form of Identification data from a cart. The data can contain a regulatory document or a frequent flyer card (the payment card is currently not available to be stored in the cart). For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/form-of-identification-details/{formOfIdentificationDetailId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve FOID data from a cart based on its id.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormOfIdentificationDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FormOfIdentificationDetailListReply retrieveFOIDFromCart(@PathParam("cartId") String cartId, @PathParam("formOfIdentificationDetailId") String formOfIdentificationDetailId, @QueryParam("lang")String lang);

    /**
     * Retrieve FOID data from a cart
     *
     * Retrieve Form of Identification data for a specific traveler from a cart. The data can contain a regulatory document or a frequent flyer card (payment card is not yet available). For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/form-of-identification-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve FOID data from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormOfIdentificationDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FormOfIdentificationDetailListReply retrieveFOIDsFromCart(@PathParam("cartId") String cartId, @QueryParam("lang")String lang);

    /**
     * Retrieve frequent flyer card information
     *
     * Retrieve frequent flyer card information from a cart based on its id.
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/frequent-flyer-cards/{frequentFlyerCardId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve frequent flyer card information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardReply retrieveFrequentFlyerCardFromCart(@PathParam("cartId") String cartId, @PathParam("frequentFlyerCardId") String frequentFlyerCardId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve frequent flyer cards information.
     *
     * Retrieve a list of frequent flyer cards from a cart based on the cart id.
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/frequent-flyer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve frequent flyer cards information.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FrequentFlyerCardsListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FrequentFlyerCardsListReply retrieveFrequentFlyerCardsFromCart(@PathParam("cartId") String cartId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve a specific hotel offer from a cart
     *
     * Retrieve the hotel offer corresponding to the given hotelOfferId from a cart. 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/hotel-offers/{hotelOfferId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a specific hotel offer from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = HotelOffersListReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public HotelOffersListReply retrieveHotelOfferFromCart(@PathParam("cartId") String cartId, @PathParam("hotelOfferId") String hotelOfferId, @QueryParam("lang")String lang);

    /**
     * Retrieve all hotel offers from a cart
     *
     * Retrieve all HotelOffers from a Cart based on cart id. 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/hotel-offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all hotel offers from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = HotelOffersListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public HotelOffersListReply retrieveHotelOffersFromCart(@PathParam("cartId") String cartId);

    /**
     * Retrieve regulatory data for a specific traveler from a Cart
     *
     * Retrieve Advance Passenger Information data for a specific traveler from a Cart. The data can contain a regulatory documents or an addresses. 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve regulatory data for a specific traveler from a Cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegulatoryApisDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryApisDetailListReply retrieveRegulatoryDetailsFromCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, @QueryParam("lang")String lang);

    /**
     * Retrieve a seat from a cart
     *
     * Retrieve a seat currently stored in the cart. 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/seats/{seatId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a seat from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SeatReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SeatReply retrieveSeatFromCart(@PathParam("cartId") String cartId, @PathParam("seatId") String seatId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve seats from a cart
     *
     * Retrieve seats currently present in the cart. 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/seats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve seats from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SeatsReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public SeatsReply retrieveSeatsFromCart(@PathParam("cartId") String cartId, @QueryParam("lastName")String lastName);

    /**
     * Retrieve a service from a cart
     *
     * Retrieve a service currently stored in the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/services/{serviceId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a service from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ServiceReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ServiceReply retrieveServiceFromCart(@PathParam("cartId") String cartId, @PathParam("serviceId") String serviceId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve services from a cart
     *
     * Retrieve services currently stored in the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/services")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve services from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ServicesReply.class),
        @ApiResponse(code = 400, message = "** Error Codes **  code    | title ------- | ----------------------- 111     | Check format 2222    | Mandatory data missing ", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public ServicesReply retrieveServicesFromCart(@PathParam("cartId") String cartId, @QueryParam("lastName")String lastName);

    /**
     * Retrieve a specific traveler from a cart
     *
     * Retrieve a traveler from a Cart based on its id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a specific traveler from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TravelerReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelerReply retrieveTravelerFromCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Retrieve all travelers from a cart
     *
     * Retrieve all travelers from a Cart based on cart id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @GET
    @Path("/shopping/carts/{cartId}/travelers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all travelers from a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TravelersListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public TravelersListReply retrieveTravelersFromCart(@PathParam("cartId") String cartId, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Update regulatory information in the Cart.
     *
     * Update specific regulatory details for Advance Passenger Information (regulatory document or address) in the Cart for a given traveler. 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}/regulatory-details/{regulatoryApisDetailId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update regulatory information in the Cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegulatoryApisDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryApisDetailListReply updateAPISInCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, @PathParam("regulatoryApisDetailId") String regulatoryApisDetailId, RegulatoryApisDetail patchAPISBody, @QueryParam("lang")String lang);

    /**
     * Update regulatory information in the Cart.
     *
     * Update the Advance Passenger Information details (regulatory documents or addresses) in the Cart for a given traveler. 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/travelers/{travelerId}/regulatory-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update regulatory information in the Cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegulatoryApisDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public RegulatoryApisDetailListReply updateAPISsInCart(@PathParam("cartId") String cartId, @PathParam("travelerId") String travelerId, List<RegulatoryApisDetail> patchAPISBody, @QueryParam("lang")String lang);

    /**
     * Update a cart
     *
     * Update an existing cart with the data provided in input:   - It is possible to add, update or delete sub-resources from the Cart.   - A list of sub-resources (such as Travelers, Contacts, Frequent flyer cards, Seats and Services) can be specified in input using the &#39;CartRequest&#39; body parameter   - Contacts, Frequent flyer cards, Seats and Services can be associated to Travelers using temporary ids, when those sub-resources are manipulated in the same transaction   - Air offers cannot be added, updated nor deleted through this operation Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a cart", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CartReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public CartReply updateCart(@PathParam("cartId") String cartId, UpdateCartRequest patchCartBody, @QueryParam("lastName")String lastName, @QueryParam("lang")String lang);

    /**
     * Update FOID information in the cart.
     *
     * Update the details for the given form of identification (regulatory document or frequent flyer) in the cart. The payment card is currently not available to be stored in the cart. For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/form-of-identification-details/{formOfIdentificationDetailId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update FOID information in the cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormOfIdentificationDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FormOfIdentificationDetailListReply updateFOIDInCart(@PathParam("cartId") String cartId, @PathParam("formOfIdentificationDetailId") String formOfIdentificationDetailId, FormOfIdentificationDetail patchFOIDBody, @QueryParam("lang")String lang);

    /**
     * Update FOID information in the cart.
     *
     * Update the form of identification details (regulatory document or frequent flyer) in the cart for a list of travelers The payment card is currently not available to be stored in the cart. For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     */
    @PATCH
    @Path("/shopping/carts/{cartId}/form-of-identification-details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update FOID information in the cart.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormOfIdentificationDetailListReply.class),
        @ApiResponse(code = 400, message = "Bad request", response = Messages.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Messages.class) })
    public FormOfIdentificationDetailListReply updateFOIDsInCart(@PathParam("cartId") String cartId, List<FormOfIdentificationDetail> patchFOIDsBody, @QueryParam("lang")String lang);
}

