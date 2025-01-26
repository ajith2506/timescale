package com.yaantrac.timescaledb.constants;

import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;
import java.util.List;

public class Constants {

    public static final String MM_DD_YYYY_FORMAT = "MM/dd/uuuu";
    public static final String IS_DELETED = "isDeleted";
    public static final String GEOFENCE_DELETED = "geofenceDeleted";
    public static final String NORMAL_CODE = "00000";
    public static final String NORMAL = "Normal";
    @Value("${aws.eventbridge.eventbusName}")
    public static String eventBusName;

    public static final String COUNT = "count";
    public static final String VEHICLE_NUMBERS = "vehicleNumbers";
    public static final String TRUCK_TYPE_ID = "my_truck";
    public static final String INFO = "Info";
    public static final String WARN = "Warn";
    public static final String INSTALLED = "Installed";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE = "date";
    public static final String ENGINE_ON_OFF_START_TIME = "engineOnOffStartTime";
    public static final String TIME_PATTERN_WITH_HOURS_MINUTES = "dd/MM/yyyy hh:mm a";
    public static final Integer ACTIVE = 1;
    public static final String MOVEMENT_DATE = "movementDate";
    public static final String MOVEMENT_START_TIMESTAMP = "movementStartTimeStamp";
    public static final String IDLE_DATE = "idleDate";
    public static final String IDLE_START_TIMESTAMP = "idleStartTimeStamp";
    public static final String TIME_PATTERN_WITH_SECONDS = "yyyy/MM/dd HH:mm:ss a";
    public static final String HOURS = " hrs ";
    public static final String MINUTES = " min ";
    public static final String SECONDS = " sec ";
    public static final String DAYS = " Days ";
    public static final String TIME_PATTERN = "hh:mm a";
    public static final Integer HOUR_SECS = 3600;
    public static final Integer MINUTE_SECS = 1000;
    public static final Integer SECS = 60;
    public static final String DATA_NIL = "Nil";
    public static final String OFF = "OFF";
    public static final String ON = "ON";
    public static final String EXPIRED = "Expired";
    public static final String DEVICE = "device";
    public static final String DISTANCE = "distance";
    public static final String GEOZONE = "geozone";
    /*---------MGS91 SERVICE KEYS------------------*/
    public static final String SENDER = "sender";
    public static final String ROUTE = "route";
    public static final String MSG91_AUTH_KEY = "authkey";
    public static final String MOBILES = "mobiles";
    public static final String DLT_TE_ID = "DLT_TE_ID";
    public static final Integer LOAN = 2;
    public static final Integer INSURANCE = 3;
    public static final Integer LICENSE = 4;
    public static final String LICENCE_UPLOAD_PRE_SIGNED_URL = "licenceUploadPreSignedURL";
    public static final String RC_UPLOAD_PRE_SIGNED_URL = "rcUploadPreSignedURL";
    public static final String LOAN_UPLOAD_PRE_SIGNED_URL = "loanUploadPreSignedURL";
    public static final String INSURANCE_UPLOAD_PRE_SIGNED_URL = "insuranceUploadPreSignedURL";
    public static final String OVERSPEED_REPORT_FILENAME = "OverSpeed Report";
    public static final String IS_ACTIVE = "isActive";
    public static final Integer IN_ACTIVE = 0;
    public static final String EVENT_REPORT = "Event Report fetched Successfully.";
    public static final String IDLE_LONGITUDE = "idleLongitude";
    public static final String IDLE_LATITUDE = "idleLatitude";
    public static final String IDLE_END_TIMESTAMP = "idleEndTimeStamp";
    public static final String USER_ID = "userID";

    public static final String USERID = "userId";

    public static final String TIMESTAMP = "timeStamp";

    public static final String IDLE_DURATION = "idleDuration";
    public static final String DRIVER_NAME = "driverName";
    public static final String YAANTRAC = "yaantrac";
    public static final String DEV = "dev";
    public static final String GEOZONE_ID = "geoZoneId";
    public static final String GEOFENCE_START_TIMESTAMP = "geoZoneInTimeStamp";
    public static final String GEOFENCE_END_TIMESTAMP = "geoZoneOutTimeStamp";
    public static final String GEO_TYPE = "geozoneType";
    public static final String OTP = "OTP";
    public static final String PASSWORD = "PASSWORD";
    public static final String NOT_FOUND = "No entity found for query";
    public static final String TRIP_CREATED_EVENT = "tripCreated";
    public static final String TRIP_STATUS_CHANGE_EVENT = "tripStatusChangeEvent";
    public static final String TRIP_STARTED = "tripStarted";
    public static final String TRIP_ENDED = "tripEnded";
    public static final String BARCODE_ID = "barcodeId";
    public static final String IS_SCANNED_SUCCESSFULLY = "isScannedSuccessfully";
    public static String s3RootFolder = "Document/";
    public static String s3LicenseFolder = "License/";
    public static String s3InsuranceFolder = "Insurance/";
    public static String s3RcFolder = "Rc/";
    public static String s3LoanFolder = "Loan/";
    public static String GenerateReport = "GenerateReport/";
    public static String Excel = "Excel/";
    public static String Pdf = "Pdf/";
    public static final String OVER_SPEED_START_TIMESTAMP = "overspeedStart";
    public static final String OVER_SPEED_END_TIMESTAMP = "overspeedEnd";
    public static final String DEVICE_ID = "deviceID";
    public static final String OVER_SPEED_DATE = "overspeedDate";
    public static final String HIKE_SPEED = "hikeSpeed";
    public static final String AVG_SPEED = "avgSpeed";
    public static final String MOVEMENT_LATITUDE = "movementLatitude";
    public static final String MOVEMENT_LONGITUDE = "movementLongitude";
    public static final String MOVEMENT_END_TIMESTAMP = "movementEndTimeStamp";
    public static final String PARKING_DURATION = "parkingDuration";
    public static final String PARKING_START_TIMESTAMP = "parkingStartTimeStamp";
    public static final String PARKING_END_TIMESTAMP = "parkingEndTimeStamp";
    public static final String PARKING_LONGITUDE = "parkingLongitude";
    public static final String PARKING_LATITUDE = "parkingLatitude";
    public static final String PARKING_DATE = "parkingDate";
    public static final String ODO_START = "odoStart";
    public static final String ODO_END = "odoEnd";
    public static final String Vehicle_Number = "vehicleNumber";
    public static final String TRIP = "trip";
    public static final String DRIVER_ID = "driverID";
    public static final String OWNER_NAME = "ownerName";
    public static final String MOVEMENT_DURATION = "movementDuration";
    public static final String STATUS = "Status";
    public static final String SUCCESS = "Success";
    public static final String CREATED = "Created";
    public static final String MODIFIED = "Modified";
    public static final String DELETED = "Deleted";
    public static final String LOGIN = "Login";
    public static final String DRIVER_ONBOARDED = "Driver Onboarded";
    public static final String DRIVER_INFO_UPDATED = "Driver Info Updated";
    public static final String DRIVER_STATUS_ACTIVATED = "Driver Status Activated";
    public static final String DRIVER_STATUS_DEACTIVATED = "Driver Status Deactivated";
    public static final String DRIVER_MAPPING_ADDED = "Driver Mapping Added";
    public static final String DRIVER_MAPPING_UPDATED = "Driver Mapping Updated";
    public static final String DRIVER_MAPPING_ACTIVATED = "Driver Mapping Activated";
    public static final String DRIVER_MAPPING_DEACTIVATED = "Driver Mapping Deactivated";
    public static final String DRIVER_MAPPING_DELETED = "Driver Mapping Deleted";
    public static final String USER_PROFILE_UPDATED = "User Profile Updated";
    public static final String USER_LOCATION_ADDED = "User Location Added";
    public static final String USER_LOCATION_UPDATED = "User Location Updated";
    public static final String DEVICE_MAPPING_UPDATED = "Device Mapping Updated";
    public static final String DEVICE_MAPPING_DELETED = "Device Mapping Deleted";
    public static final String USER_LOGGED_IN = "User Logged In";
    public static final String USER_PHONE_NUMBER_CHANGED = "User Phone Number Changed";
    public static final String USER_EMAIL_ID_CHANGED = "User Email Id Changed";
    public static final String USER_PASSWORD_CHANGED = "User Password Changed";
    public static final String GEOFENCE_OVERSPEED_REPORT_FILENAME = "Geofence OverSpeed Report";
    public static final String GEOFENCE_OVERSPEED_END_TIMESTAMP = "geoZoneOutTimeStamp";
    public static final String SOURCE_GROUP_NOT_FOUND = "Source Group not found";
    public static final String GROUP_NOT_FOUND = "Group not found";
    public static final String DESTINATION_GROUP_NOT_FOUND = " Destination Group not found";
    public static final String GEO_ZONE_NAME = "geoZoneName";
    public static final String GEO_ZONE_OUT_TIME = "geoZoneOutTimeStamp";
    public static final String GEO_ZONE_IN_TIME = "geoZoneInTimeStamp";
    public static final String KHUB = "khub";
    public static final String SERVER_ERROR_MESSAGE = "We are facing some issue. Please try again later";
    public static final String IN_TRANSIT = "IN_TRANSIT";
    public static final String PENDING = "PENDING";
    public static final String NOT_DELIVERED = "NOT_DELIVERED";
    public static final String CANCELLED = "CANCELLED";
    public static final String RESCHEDULED = "RESCHEDULED";
    public static final String COMPLETED = "COMPLETED";
    public static final String ORDER_DELIVERY = "ORDER_DELIVERY";
    public static final String DIRECT_SALES = "DIRECT_SALES";
    public static final String TRIP_SOURCE = "TRIP_SOURCE";
    public static final String FIREBASE_EXCEPTION = "Firebase exception has occurred";
    public static final String MIXED_UP = "MIXED_UP";
    public static final String STOP_COMPLETE = "STOP_COMPLETE";
    public static final String PAYMENT_COLLECTION = "PAYMENT_COLLECTION";
    public static final String OTHERS = "OTHERS";
    public static final String ADHOC_STOP = "ADHOC_STOP";
    public static final String INITIAL_TRIP_POLYLINE = "INITIAL_TRIP_POLYLINE";
    public static final String RE_OPTIMIZED_TRIP_POLYLINE = "RE_OPTIMIZED_TRIP_POLYLINE";
    public static final String OFFLINE = "Offline";
    public static final String IDLE = "Idle";
    public static final String MOMENT = "Moving";
    public static final String PARKING = "Parked";
    public static final List<String> ALLOWED_STATUS_UPDATES = Arrays.asList(
            Constants.NOT_DELIVERED,
            Constants.CANCELLED,
            Constants.STOP_COMPLETE,
            Constants.RESCHEDULED
    );
    public static final List<String> RE_OPTIMIZE_STATUS_UPDATES = Arrays.asList(
            Constants.CANCELLED,
            Constants.RESCHEDULED
    );
    public static final List<String> ALLOWED_SCAN_ORDER_STATUS = Arrays.asList(
            Constants.IN_TRANSIT,
            Constants.CANCELLED,
            Constants.NOT_DELIVERED
    );
    public static final String MOBILE_GPS = "MOBILE_GPS";
    public static final List<String> TRACKING_METHODS = Arrays.asList(
            Constants.DEVICE,
            Constants.MOBILE_GPS
    );
    public static final List<String> ALLOWED_SALES_UPDATES = Arrays.asList(
            Constants.STOP_COMPLETE,
            Constants.CANCELLED,
            Constants.RESCHEDULED
    );
    public static final String ERROR = "Error";
    public static final String VEHICLE_TYPE = "vehicleType";
    public static final String ASIA_KOLKATA_TIMEZONE = "Asia/Kolkata";
    public static final String RED_COLOR_START = "\033[31m";
    public static final String COLOR_RESET = "\033[0m";
    public static final String NOT_APPLICABLE = "N/A";
    public static final String DRIVER_DELETED = "Driver Deleted";

    public static final String HARSH_BRAKING = "Harsh Braking";
    public static final String HARSH_ACCELERATION = "Harsh Acceleration";
    public static final String OVERSPEED = "Overspeed";
    public static final String IGNITION_ON = "Ignition On";
    public static final String IGNITION_OFF = "Ignition Off";
    public static final String GEOFENCE_IN = "Geofence In";
    public static final String GEOFENCE_OUT = "Geofence Out";
    public static final String TRACKING_MARKER = "t";

    public static final String STATUS_CODE = "statusCode";
    public static final String TRIP_CODE = "tripCode";
    public static final String GROUP_ID = "groupID";
    public static final String TRIP_ID = "tripID";
    public static final String USER_NAME = "userName";
    public static final String ENGINE_DURATION = "engineOnOffDuration";
    public static final String EQUIPMENT_TYPE = "equipmentType";
    public static final String ID = "id";
    public static final String CONTACT_EMAIL = "contactEmail";
    public static final String LICENSE_NUMBER = "licenseNumber";
    public static final String CREATED_AT = "createdAt";
    public static final String SPEED_KPH = "speedKPH";
    public static final String DEACTIVATED = "deactivated";
    public static final String FUEL_USAGE = "fuelUsage";
    public static final String MILEAGE = "mileage";
    public static final String FUEL_REFILL = "fuelRefill";
    public static final String INITIAL_FUEL = "initialFuel";
    public static final String FUEL_LEVEL = "fuelLevel";
    public static final String HEADING = "heading";
    public static final String IGNITION_STATE = "ignitionState";
    public static final String DISTANCE_KM = "distanceKM";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String SALESPERSON = "salesperson";
    public static final String ASSETS = "assets";
    public static final String UNEXPECTED_VALUE = "Unexpected value: ";
    public static final String LAND_MARK_NAME = "landMarkName";
    public static final String NOT_ACTIVATED = "Not Activated";
    public static final String ACTIVATED = "Activated";
    public static final List<Integer> statusCodesArray = Arrays.asList(0, 61472, 61968, 62000, 63553, 64784, 61722);
    public static final String MY_LOCATION_NAME = "myLocationName";
    public static final String MY_LOCATION = "mylocation";
    public static final String LANDMARK = "landmark";
    public static final String ORDER_ID = "orderId";
    public static final String MOBILE_ID = "mobileID";

    public static final String MOBILE_NUMBER = "mobileNumber";
    public static final String ENTITY_NAME = "entityName";
    public static final String TRIPS = "trips";
    public static final String FIRE_BASE_TOKEN = "fireBaseToken";
    public static final String IS_TRIP_COMPLETED = "isTripCompleted";
    public static final String POLYLINE = "tripPolyLine";

    public static final String GOOD = "Good";
    public static final String MEDIUM = "Medium";
    public static final String BAD = "Bad";
    public static final String ONLINE = "Online";

    public static final String ACTUAL_START_TIMESTAMP = "actualStartTimestamp";
    public static final String ACTUAL_END_TIMESTAMP = "actualEndTimestamp";
    public static final String START_TIMESTAMP = "startTimestamp";
    public static final String END_TIMESTAMP = "endTimestamp";
    public static final String FENCE_IN_ALARM_TYPE = "Fence In";
    public static final String FENCE_OUT_ALARM_TYPE = "Fence Out";
    public static final String NONE = "none";
    public static final String NOT_INSTALLED = "Not installed";
    public static final String ASSIGNED_ORDER_ID = "assignedOrderId";
    public static final String TRACKING_MARKER_FULL = "trackingMarker";



    public static final String DEVICE_STATUS_ONLINE = "online";
    public static final  String DEVICE_STATUS_OFFLINE = "offline";
    public static final String DEVICE_STATUS_IDLE = "idle";

    public static final  String TOTAL = "total";
    public static final String DEVICE_STATUS_PARKED = "parked";
    public static final String DEVICE_STATUS_MOVING = "moving";
    public static final String POOR = "poor";
    public static final String STRONG = "strong";
    public static final String VERY_POOR = "very poor";
    public static final String PERSON = "person";
    public static final String GMT_TIME = "GMT+05:30";
    public static final Integer ON_ROUTE_STATUS_CODE = 61472;
    public static final  Integer ACC_ON_STATUS_CODE = 61472;
    public static final Integer ACC_OFF_STATUS_CODE = 62528;
    public static final String IST_TIME = "GMT+05:35";

    public static final String ASCII_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String ASCII_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String FAILED = "failed";
    public static final String DRIVER_SCORECARD_REPORT_FILE_NAME = "DriverScorecard Report" ;

    public static final String TEXT_STYLE = "Times New Roman";

    public static final String IST_TIMEZONE = "Asia/Kolkata" ;
    public static final String LOGO_IMG_PATH = "Document/report_pdf_img/yaantraclogo.png";
    public static final int INFLUX_DRIVER_SCORE_CARD_COLUMNS = 8;
    public static final String USER = "ownerName";
    public static final String DRIVER_SCORECARD_ID = "DriverId";
    public static final String DRIVER_NAMESS = "DriverName";
    public static final String DATES = "Date";
    public static final String  HARSHACCELERATION = "HarshAcceleration";
    public static final String HARSHCORNERING = "HarshCornering";
    public static final String HARSHBRAKING = "HarshBraking";
    public static final String OVER_SPEED_DETAILS= "OverSpeedDetails";
    public static final String DRIVER_SCORE = "DriverScore";
    public static final String DEVICE_STATUS_TOTAL = "total";

   public static final String ACCOUNT_DEACTIVATED_MESSAGE = "Your account is currently deactivated.Please contact Admin to activate";

    public static final String DRIVER_UUID = "driverUuid";



}