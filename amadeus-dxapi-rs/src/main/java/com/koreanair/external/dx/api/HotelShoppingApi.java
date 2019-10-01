package com.koreanair.external.dx.api;

import java.time.LocalDate;
import com.koreanair.external.dx.vo.Messages;
import com.koreanair.external.dx.vo.MultiHotelsOffers;
import com.koreanair.external.dx.vo.SingleHotelOffers;

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
public interface HotelShoppingApi  {

    /**
     * Search for hotels and retrieve availability and rates information
     *
     *  This method returns a list of hotels with multiple shopping offers around a city center or geolocation for a given date range.   Alternatively, it is also possible to ask for a specific list of hotels.   The user can refine the search criteria by asking for specific hotel categories, hotel chains or hotel facilities, such as parking or restaurant.   It is also possible to ask for a specific meal or budget.   By default, only available hotels are returned, with the cheapest available option for each hotel. It is however also possible to retrieve details about the closed properties, and to retrieve all available offers per hotel at this stage.   -------------------------------------------------------------   Warning: at this step only preleminary prices are returned.   Minimum mandatory parameters for this search: at least one of the following criteria (which are mutually exclusive): - cityCode - longitude and latitude - list of hotels -------------------------------------------------------------  
     *
     */
    @GET
    @Path("/search/hotel-offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Search for hotels and retrieve availability and rates information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of hotel offers, ie. hotels with their attributes plus available rates at each returned hotel.", response = MultiHotelsOffers.class),
        @ApiResponse(code = 400, message = "code    | title                                  ------- | -------------------------------------  23      | PASSENGER TYPE NOT SUPPORTED 61      | INVALID CURRENCY CODE 137     | INVALID ADULTS OCCUPANCY REQUESTED 145     | DURATION PERIOD OR DATES INCORRECT 195     | SERVICE RESTRICTION 249     | INVALID RATE CODE 377     | MAX STAY DURATION IS EXCEEDED 381     | INVALID CHECK-IN DATE 382     | INVALID CHECK-OUT DATE 383     | INVALID CITY CODE 392     | INVALID HOTEL CODE 397     | INVALID NUMBER OF ADULTS 400     | INVALID PROPERTY CODE 402     | INVALID ROOM TYPE 404     | CHECK_OUT DATE MUST BE FURTHER IN THE FUTURE THAN CHECK-IN DATE 424     | NO HOTELS FOUND WHICH MATCH THIS INPUT 431     | CHECK-OUT DATE IS TOO FAR IN THE FUTURE 450     | INVALID PROVIDER RESPONSE 451     | INVALID CREDENTIALS 562     | RESTRICTED ACCESS FOR THE REQUESTED RATES AND CHAINS 784     | TIME OUT 790     | NO PROPERTIES FOUND WITHIN THIS RADIUS 795     | NO SIMILAR NAME FOUND, PLEASE ENLARGE YOUR SEARCH CRITERIA 842     | RATE SECURITY NOT LOADED ", response = Messages.class),
        @ApiResponse(code = 500, message = "Internal server error.", response = Messages.class) })
    public MultiHotelsOffers getMultiHotelOffers(@QueryParam("cityCode")String cityCode, @QueryParam("latitude")Double latitude, @QueryParam("longitude")Double longitude, @QueryParam("hotelIds")List<String> hotelIds, @QueryParam("checkInDate")LocalDate checkInDate, @QueryParam("checkOutDate")LocalDate checkOutDate, @QueryParam("adults")Integer adults, @QueryParam("childAges")List<Integer> childAges, @QueryParam("countryOfResidence")String countryOfResidence, @QueryParam("radius")@DefaultValue("5") Integer radius, @QueryParam("radiusUnit")@DefaultValue("km") String radiusUnit, @QueryParam("hotelName")String hotelName, @QueryParam("providerCodes")List<String> providerCodes, @QueryParam("rateCodes")List<String> rateCodes, @QueryParam("preferredProviderCodes")List<String> preferredProviderCodes, @QueryParam("roomQuantity")Integer roomQuantity, @QueryParam("amenities")List<String> amenities, @QueryParam("ratings")List<Integer> ratings, @QueryParam("priceRange")String priceRange, @QueryParam("currencyCode")String currencyCode, @QueryParam("paymentPolicy")String paymentPolicy, @QueryParam("boardType")String boardType, @QueryParam("includeClosed")@DefaultValue("false") Boolean includeClosed, @QueryParam("bestRateOnly")@DefaultValue("true") Boolean bestRateOnly, @QueryParam("view")@DefaultValue("FULL") String view, @QueryParam("sort")@DefaultValue("NONE") String sort, @QueryParam("page[limit]")Integer pageLimit, @QueryParam("page[offset]")String pageOffset, @QueryParam("lang")String lang);

    /**
     * Get room and rate details
     *
     * Return all available details of a specific offer for a specific property. Returned details mainly includes:  - accepted methods of payment  - cancellation policies  - guaranteed pricing  - descriptions about the meal, room, and rate plan.  
     *
     */
    @GET
    @Path("/search/hotel-offers/{offerId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get room and rate details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Details of a single offer on a given hotel.", response = SingleHotelOffers.class),
        @ApiResponse(code = 400, message = "code    | title                                  ------- | -------------------------------------  23      | PASSENGER TYPE NOT SUPPORTED 61      | INVALID CURRENCY CODE 137     | INVALID ADULTS OCCUPANCY REQUESTED 145     | DURATION PERIOD OR DATES INCORRECT 195     | SERVICE RESTRICTION 249     | INVALID RATE CODE 377     | MAX STAY DURATION IS EXCEEDED 381     | INVALID CHECK-IN DATE 382     | INVALID CHECK-OUT DATE 383     | INVALID CITY CODE 392     | INVALID HOTEL CODE 397     | INVALID NUMBER OF ADULTS 400     | INVALID PROPERTY CODE 402     | INVALID ROOM TYPE 404     | CHECK_OUT DATE MUST BE FURTHER IN THE FUTURE THAN CHECK-IN DATE 424     | NO HOTELS FOUND WHICH MATCH THIS INPUT 431     | CHECK-OUT DATE IS TOO FAR IN THE FUTURE 450     | INVALID PROVIDER RESPONSE 451     | INVALID CREDENTIALS 562     | RESTRICTED ACCESS FOR THE REQUESTED RATES AND CHAINS 784     | TIME OUT 790     | NO PROPERTIES FOUND WITHIN THIS RADIUS 795     | NO SIMILAR NAME FOUND, PLEASE ENLARGE YOUR SEARCH CRITERIA 842     | RATE SECURITY NOT LOADED ", response = Messages.class),
        @ApiResponse(code = 404, message = "Hotel or offer not found", response = Messages.class),
        @ApiResponse(code = 500, message = "Internal server error.", response = Messages.class) })
    public SingleHotelOffers getOfferPricing(@PathParam("offerId") String offerId, @QueryParam("cartId")String cartId, @QueryParam("lang")String lang);

    /**
     * Get one hotel and its available offers
     *
     *  This method will return all available offers for a given hotel at a given date range.   The user can refine the search criteria by asking for a specific meal or budget, or other parameters as described in this documentation.   The returned list of offers can show different prices due to different room types (a luxury suite should be more expensive than a standard room), board type (a rate can include or not a breakfast or a dinner), or rate code (for example, some specific discount can apply for senior guests)   -------------------------------------------------------------   Warning: at this step, only preliminary prices are returned.  
     *
     */
    @GET
    @Path("/search/hotel-offers/by-hotel")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get one hotel and its available offers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Details of a single offer on a given hotel.", response = SingleHotelOffers.class),
        @ApiResponse(code = 400, message = "code    | title                                  ------- | -------------------------------------  23      | PASSENGER TYPE NOT SUPPORTED 61      | INVALID CURRENCY CODE 137     | INVALID ADULTS OCCUPANCY REQUESTED 145     | DURATION PERIOD OR DATES INCORRECT 195     | SERVICE RESTRICTION 249     | INVALID RATE CODE 377     | MAX STAY DURATION IS EXCEEDED 381     | INVALID CHECK-IN DATE 382     | INVALID CHECK-OUT DATE 383     | INVALID CITY CODE 392     | INVALID HOTEL CODE 397     | INVALID NUMBER OF ADULTS 400     | INVALID PROPERTY CODE 402     | INVALID ROOM TYPE 404     | CHECK_OUT DATE MUST BE FURTHER IN THE FUTURE THAN CHECK-IN DATE 424     | NO HOTELS FOUND WHICH MATCH THIS INPUT 431     | CHECK-OUT DATE IS TOO FAR IN THE FUTURE 450     | INVALID PROVIDER RESPONSE 451     | INVALID CREDENTIALS 562     | RESTRICTED ACCESS FOR THE REQUESTED RATES AND CHAINS 784     | TIME OUT 790     | NO PROPERTIES FOUND WITHIN THIS RADIUS 795     | NO SIMILAR NAME FOUND, PLEASE ENLARGE YOUR SEARCH CRITERIA 842     | RATE SECURITY NOT LOADED ", response = Messages.class),
        @ApiResponse(code = 404, message = "Hotel not found", response = Messages.class),
        @ApiResponse(code = 500, message = "Internal server error.", response = Messages.class) })
    public SingleHotelOffers getSingleHotelOffers(@QueryParam("hotelId")String hotelId, @QueryParam("checkInDate")LocalDate checkInDate, @QueryParam("checkOutDate")LocalDate checkOutDate, @QueryParam("adults")Integer adults, @QueryParam("childAges")List<Integer> childAges, @QueryParam("countryOfResidence")String countryOfResidence, @QueryParam("rateCodes")List<String> rateCodes, @QueryParam("roomQuantity")Integer roomQuantity, @QueryParam("currencyCode")String currencyCode, @QueryParam("paymentPolicy")String paymentPolicy, @QueryParam("boardType")String boardType, @QueryParam("view")@DefaultValue("FULL_ALL_IMAGES") String view, @QueryParam("lang")String lang);
}
