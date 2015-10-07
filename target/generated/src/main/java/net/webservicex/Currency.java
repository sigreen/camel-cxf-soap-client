
package net.webservicex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Currency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFA"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GHC"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="XAU"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MGF"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MTL"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MZM"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="XPF"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="XPD"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="XPT"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="XAG"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SDD"/&gt;
 *     &lt;enumeration value="SRG"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="VEB"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="YUM"/&gt;
 *     &lt;enumeration value="ZMK"/&gt;
 *     &lt;enumeration value="ZWD"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Currency")
@XmlEnum
public enum Currency {

    AFA,
    ALL,
    DZD,
    ARS,
    AWG,
    AUD,
    BSD,
    BHD,
    BDT,
    BBD,
    BZD,
    BMD,
    BTN,
    BOB,
    BWP,
    BRL,
    GBP,
    BND,
    BIF,
    XOF,
    XAF,
    KHR,
    CAD,
    CVE,
    KYD,
    CLP,
    CNY,
    COP,
    KMF,
    CRC,
    HRK,
    CUP,
    CYP,
    CZK,
    DKK,
    DJF,
    DOP,
    XCD,
    EGP,
    SVC,
    EEK,
    ETB,
    EUR,
    FKP,
    GMD,
    GHC,
    GIP,
    XAU,
    GTQ,
    GNF,
    GYD,
    HTG,
    HNL,
    HKD,
    HUF,
    ISK,
    INR,
    IDR,
    IQD,
    ILS,
    JMD,
    JPY,
    JOD,
    KZT,
    KES,
    KRW,
    KWD,
    LAK,
    LVL,
    LBP,
    LSL,
    LRD,
    LYD,
    LTL,
    MOP,
    MKD,
    MGF,
    MWK,
    MYR,
    MVR,
    MTL,
    MRO,
    MUR,
    MXN,
    MDL,
    MNT,
    MAD,
    MZM,
    MMK,
    NAD,
    NPR,
    ANG,
    NZD,
    NIO,
    NGN,
    KPW,
    NOK,
    OMR,
    XPF,
    PKR,
    XPD,
    PAB,
    PGK,
    PYG,
    PEN,
    PHP,
    XPT,
    PLN,
    QAR,
    ROL,
    RUB,
    WST,
    STD,
    SAR,
    SCR,
    SLL,
    XAG,
    SGD,
    SKK,
    SIT,
    SBD,
    SOS,
    ZAR,
    LKR,
    SHP,
    SDD,
    SRG,
    SZL,
    SEK,
    CHF,
    SYP,
    TWD,
    TZS,
    THB,
    TOP,
    TTD,
    TND,
    TRL,
    USD,
    AED,
    UGX,
    UAH,
    UYU,
    VUV,
    VEB,
    VND,
    YER,
    YUM,
    ZMK,
    ZWD,
    TRY;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
