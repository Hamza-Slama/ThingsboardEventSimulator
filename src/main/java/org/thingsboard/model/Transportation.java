package org.thingsboard.model;


import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.HashMap;
import java.util.Map;
@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "READER_ID",
        "ATD_SENSOR_ID",
        "KITS_ID",
        "ATD_LOCATION_ID",
        "MODIFIED_DATE",
        "SENSOR_STATUS",
        "TURN_ON_DATE",
        "SENSOR_TYPE",
        "SENSOR_MFG",
        "COA_INTERSECTION_ID",
        "PRIMARY_ST_SEGMENT_ID",
        "CROSS_ST_SEGMENT_ID",
        "LANDMARK",
        "PRIMARY_ST_AKA",
        "CROSS_ST_AKA",
        "SIGNAL_ENG_AREA",
        "COUNCIL_DISTRICT",
        "JURISDICTION",
        "LOCATION_TYPE",
        "LOCATION_NAME",
        "PRIMARY_ST",
        "CROSS_ST",
        "PRIMARY_ST_BLOCK",
        "COUNTY",
        "CROSS_ST_BLOCK",
        "Location",
        "IP_COMM_STATUS",
        "COMM_STATUS_DATETIME_UTC",
        "LOCATION_LATITUDE",
        "LOCATION_LONGITUDE",
        "Source DB ID"
})
public class Transportation {

    @JsonProperty("READER_ID")
    private String rEADERID;
    @JsonProperty("ATD_SENSOR_ID")
    private Integer aTDSENSORID;
    @JsonProperty("KITS_ID")
    private String kITSID;
    @JsonProperty("ATD_LOCATION_ID")
    private String aTDLOCATIONID;
    @JsonProperty("MODIFIED_DATE")
    private String mODIFIEDDATE;
    @JsonProperty("SENSOR_STATUS")
    private String sENSORSTATUS;
    @JsonProperty("TURN_ON_DATE")
    private String tURNONDATE;
    @JsonProperty("SENSOR_TYPE")
    private String sENSORTYPE;
    @JsonProperty("SENSOR_MFG")
    private String sENSORMFG;
    @JsonProperty("COA_INTERSECTION_ID")
    private String cOAINTERSECTIONID;
    @JsonProperty("PRIMARY_ST_SEGMENT_ID")
    private String pRIMARYSTSEGMENTID;
    @JsonProperty("CROSS_ST_SEGMENT_ID")
    private String cROSSSTSEGMENTID;
    @JsonProperty("LANDMARK")
    private String lANDMARK;
    @JsonProperty("PRIMARY_ST_AKA")
    private String pRIMARYSTAKA;
    @JsonProperty("CROSS_ST_AKA")
    private String cROSSSTAKA;
    @JsonProperty("SIGNAL_ENG_AREA")
    private String sIGNALENGAREA;
    @JsonProperty("COUNCIL_DISTRICT")
    private String cOUNCILDISTRICT;
    @JsonProperty("JURISDICTION")
    private String jURISDICTION;
    @JsonProperty("LOCATION_TYPE")
    private String lOCATIONTYPE;
    @JsonProperty("LOCATION_NAME")
    private String lOCATIONNAME;
    @JsonProperty("PRIMARY_ST")
    private String pRIMARYST;
    @JsonProperty("CROSS_ST")
    private String cROSSST;
    @JsonProperty("PRIMARY_ST_BLOCK")
    private Integer pRIMARYSTBLOCK;
    @JsonProperty("COUNTY")
    private String cOUNTY;
    @JsonProperty("CROSS_ST_BLOCK")
    private String cROSSSTBLOCK;
    @JsonProperty("Location")
    private String location;
    @JsonProperty("IP_COMM_STATUS")
    private String iPCOMMSTATUS;
    @JsonProperty("COMM_STATUS_DATETIME_UTC")
    private String cOMMSTATUSDATETIMEUTC;
    @JsonProperty("LOCATION_LATITUDE")
    private Double lOCATIONLATITUDE;
    @JsonProperty("LOCATION_LONGITUDE")
    private Double lOCATIONLONGITUDE;
    @JsonProperty("Source DB ID")
    private String sourceDBID;

}