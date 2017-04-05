/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This is a concrete class that provides the capability of enabling or d 
* isabling a PolicyCondition according to a pre-determined time schedule 
* . This enables this class to effectively enable or disable evaluation  
* of the entire condition clause. The simplest way to do this is to spec 
* ify a value for the TimePeriod class attribute; this may of course be  
* modified by other class attributes as necessary. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyConditionTimePeriod extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field timePeriod
* This is a string attribute that defines an overall range of calendar d 

* ates and times over which a PolicyRule is valid. As such, this is the  

* most basic way to use date and/or time to enable or disable a given Po 

* licyRule.</br>Date/times are expressed as substrings of the form:</br> 

* "yyyymmddThhmmss".</br></br></br>This attribute is based on time as de 

* fined in RFC 2445. This calls for a string to represent a starting dat 

* e and time, in which the character 'T' indicates the beginning of the  

* time portion, followed by the solidus character ('/'), followed by a s 

* imilar string representing an end date and time. The first date indica 

* tes the beginning of the range, while the second date indicates the en 

* d. The second date and time must be later than the first.</br></br></b 

* r>For example:</br></br> 20000101T080000/20000131T120000</br></br>is i 

* nterpreted as:</br> January 1, 2000, 0800 through January 31, 2000, no 

* on</br></br>There are also two special cases in which one of the date/ 

* time strings is replaced with a special string defined in RFC 2445. </ 

* br></br> - If the first date/time is replaced with the string "THISAND 

* PRIOR", then the property indicates that a policy rule is valid, from  

* now until the date/time that appears after the '/'.</br></br> - If the 

*  second date/time is replaced with the string "THISANDFUTURE", then th 

* e property indicates that a policy rule becomes valid on the date/time 

*  that appears before the '/', and remains valid from that point on.</b 

* r></br>Notes: Not present in the ITU specs. The CIM defines a similar  

* attribute called TimePeriod.</br> 

*/
protected String timePeriod ;




/**  
* Field monthOfYearMask
* The monthOfYearMask attribute is a string that refines the definition  

* of the valid time period that is defined by the timePeriod attribute.  

* This is done by explicitly specifying the months when the policy is va 

* lid. Thus, the timePeriod attribute is used to specify the overall tim 

* e period during which the policy might be valid, and the monthOfYearMa 

* sk attribute is used to pick out the specific months within that time  

* period when the PolicyRule is valid. This attribute consists of a fixe 

* d string of 16 bits. The first 12 bits correspond to the 12 months of  

* the year, beginning with January and ending with December. The last 4  

* bits are always set to "0". For each month, the value "1" indicates th 

* at the policy is valid for that month, and the value "0" indicates tha 

* t it is not valid.</br></br>If this attribute is not specified, then t 

* he PolicyRule is treated as valid for all twelve months.</br></br>Note 

* s: Not present in the ITU specs. The CIM defines a similar attribute c 

* alled MonthOfYearMask. 

*/
protected String monthOfYearMask ;




/**  
* Field dayOfMonthMask
* This is a string attribute that refines the definition of the valid ti 

* me period that is defined by the timePeriod attribute. This is done by 

*  explicitly specifying the days of the month when the policy is valid. 

* </br></br>These attributes work together, with the timePeriod attribut 

* e used to specify the overall time period during which the PolicyRule  

* might be valid, and the dayOfMonthMask attribute used to pick out the  

* specific days of the month within that time period when the PolicyRule 

*  is valid.</br></br>This property is formatted as a fixed string of 64 

*  bits. The first 31 bits correspond to the days of the month counting  

* from the beginning, followed by 31 more bits identifying the days of t 

* he month counting from the end, followed by 2 bits that are always set 

*  to '0'.</br></br>For each day, the value '1' indicates that the polic 

* y is valid for that day, and the value '0' indicates that it is not va 

* lid. The value X'80 00 00 01 00 00 00 00', for example, indicates that 

*  a PolicyRule is valid on the first and last days of the month.</br></ 

* br>For months with fewer than 31 days, the digits corresponding to day 

* s that the months do not have (counting in both directions) are ignore 

* d.</br></br>The encoding of the 62 significant bits in the octet strin 

* g matches that used for the schedDay object in the DISMAN-SCHEDULE-MIB 

* .</br></br>If this attribute is not specified, then the PolicyRule is  

* treated as valid for all days in the months specified by the timePerio 

* d attribute.</br> 

*/
protected String dayOfMonthMask ;




/**  
* Field dayOfWeekMask
* This is a string attribute that refines the definition of the valid ti 

* me period that is defined by the timePeriod attribute. This is done by 

*  explicitly specifying the days of the week when the PolicyRule is val 

* id. These attributes work together, with the timePeriod attribute used 

*  to specify the overall time period when the policy might be valid, an 

* d the DayOfWeekMask used to pick out the specific days of the week in  

* that time period when the PolicyRule is valid.</br></br>This property  

* is formatted as a fixed length string of 8 bits. The first 7 bits iden 

* tify the 7 days of the week, beginning with Sunday and ending with Sat 

* urday, followed by 1 bit that is always set to '0'. For each day of th 

* e week, the value '1' indicates that the PolicyRule is valid for that  

* day, and the value '0' indicates that it is not valid.</br></br>If thi 

* s attribute is not specified, then the PolicyRule is treated as valid  

* for all 7 days in the weeks specified by the timePeriod attribute.</br 

* ></br>Notes: Not present in the ITU specs. The CIM defines a similar a 

* ttribute called DayOfWeekMask. 

*/
protected String dayOfWeekMask ;




/**  
* Field timeOfDayMask
* This is a string attribute that refines the definition of the valid ti 

* me period that is defined by the timePeriod attribute. This is done by 

*  explicitly specifying a range of times in a day the PolicyRule is val 

* id for. These attributes work together, with the timePeriod attribute  

* used to specify the overall time period that the PolicyRule is valid f 

* or, and the timeOfDayMask attribute used to pick out which range of ti 

* me periods in a given day of that time period the PolicyRule is valid  

* for.</br></br>This attribute is formatted in the style of RFC 2445: a  

* time string beginning with the character 'T', followed by the solidus  

* character ('/'), followed by a second time string. The first time indi 

* cates the beginning of the range, while the second time indicates the  

* end. Times are expressed as substrings of the form "Thhmmss".</br></br 

* >The second substring always identifies a later time than the first su 

* bstring. To allow for ranges that span midnight, however, the value of 

*  the second string may be smaller than the value of the first substrin 

* g. Thus, "T080000/T210000" identifies the range from 0800 until 2100,  

* while "T210000/T080000" identifies the range from 2100 until 0800 of t 

* he following day.</br></br>When a range spans midnight, it by definiti 

* on includes parts of two</br>successive days. When one of these days i 

* s also selected by either the monthOfYearMask, dayOfMonthMask, and/or  

* dayOfWeekMask, but the other day is not, then the policy is active onl 

* y during the portion of the range that falls on the selected day. For  

* example, if the range extends from 2100 until 0800, and the day of wee 

* k mask selects Monday and Tuesday, then the policy is active during th 

* e following three intervals:</br></br> From midnight Sunday until 0800 

*  Monday;</br> From 2100 Monday until 0800 Tuesday;</br> From 2100 Tues 

* day until 23:59:59 Tuesday.</br></br>If this attribute is not specifie 

* d, then the PolicyRule is treated as valid for the entire day, for all 

*  days specified by the timePeriod attribute.</br> 

*/
protected String timeOfDayMask ;




/**  
* Field isLocalTime
* This is a Boolean attribute that, if TRUE, signifies that the times re 

* presented in the timePeriod attribute and in the various Mask attribut 

* es represent local times. If the value of this attribute is FALSE, the 

* n this means that the times represented in the timePeriod attribute an 

* d in the various Mask attributes represent UTC times.</br></br>There i 

* s no provision for mixing of local times and UTC times: the value of t 

* his attribute applies to all of the other time-related attributes.</br 

* ></br>Notes: Not present in the ITU specs. The CIM defines a similar a 

* ttribute called LocalOrUtcTime. 

*/
protected Boolean isLocalTime ;


}