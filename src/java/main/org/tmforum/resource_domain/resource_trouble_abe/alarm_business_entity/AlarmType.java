/**
* Alarm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.e.c.f7AAIWE.eC.gR.b9X.b.l.f.oNQ-content.html">Alarm ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_business_entity ;

/**
* This datatype defines the possible alarm values. It is aligned with th 
* e NGCOR aalrm type definition. 
 @since SID_R16.5
*/ 

public  enum AlarmType  {



/**  
* Field COMMUNICATIONS_ALARM
* An alarm of this type is associated with the procedure and/or process  

* required conveying information from one point to another (ITU-T Recomm 

* endation X.733). 

*/
 COMMUNICATIONS_ALARM ,




/**  
* Field COMMUNICATIONS_INTERFACE_ALARM
* An alarm of this type is associated with interface error, e.g. physica 

* l interface of communication error. It is a subtype of Communications  

* Alarm. 

*/
 COMMUNICATIONS_INTERFACE_ALARM ,




/**  
* Field COMMUNICATIONS_SIGNALLING_AND_IP_ALARM
* An alarm of this type is associated with signalling and IP failure, e. 

* g.SS7 protocol error. It is a subtype of Communications Alarm. 

*/
 COMMUNICATIONS_SIGNALLING_AND_IP_ALARM ,




/**  
* Field ENVIRONMENTAL_ALARM
* An alarm of this type is associated with a condition related to an enc 

* losure in which the equipment resides (ITU-T Recommendation X.733). 

*/
 ENVIRONMENTAL_ALARM ,




/**  
* Field EQUIPMENT_ALARM
* An alarm of this type is associated with an equipment fault (ITU-T Rec 

* ommendation X.733). 

*/
 EQUIPMENT_ALARM ,




/**  
* Field EQUIPMENT_CHARGING_SYSTEM_ALARM
* An alarm of this type is associated with charging system fault, e.g.bi 

* lling file error etc. It is a subtype of Equipment Alarm. 

*/
 EQUIPMENT_CHARGING_SYSTEM_ALARM ,




/**  
* Field EQUIPMENT_EQUIPMENT_POWER_ALARM_
* An alarm of this type is associated with equipment power problem, e.g. 

*  power supply failure. It is a subtype of Equipment Alarm.  

*/
 EQUIPMENT_EQUIPMENT_POWER_ALARM_ ,




/**  
* Field EQUIPMENT_EXTERNAL_IO_EQUIPMENT_ALARM_
* An alarm of this type is associated with an external I/O equipment fai 

* lure, e.g. disk problem. It is a subtype of Equipment Alarm.  

*/
 EQUIPMENT_EXTERNAL_IO_EQUIPMENT_ALARM_ ,




/**  
* Field EQUIPMENT_RELAY_AND_TRANSMISSION_ALARM_
* An alarm of this type is associated with relay and transmission failur 

* e, e.g. printer un-reachable. It is a subtype of Equipment Alarm. 

*/
 EQUIPMENT_RELAY_AND_TRANSMISSION_ALARM_ ,




/**  
* Field EQUIPMENT_TRAFFIC_EQUIPMENT_ALARM
* An alarm of this type is associated with traffic related equipment fau 

* lt, e.g. antenna, receiver, transmitter, and switch fault etc. It is a 

*  subtype of Equipment Alarm. 

*/
 EQUIPMENT_TRAFFIC_EQUIPMENT_ALARM ,




/**  
* Field INTEGRITY_VIOLATION
* An indication that information may have been illegally modified, inser 

* ted or deleted. 

*/
 INTEGRITY_VIOLATION ,




/**  
* Field INTEGRITY_VIOLATION_DATA_CONFIGURATION
* An alarm of this type is associated with data configuration failure. e 

* .g. switch data configuration error. It is a subtype of Integrity Viol 

* ation. 

*/
 INTEGRITY_VIOLATION_DATA_CONFIGURATION ,




/**  
* Field INTEGRITY_VIOLATION_DATABASE_SYSTEM
* An alarm of this type is associated with database system failure. e.g. 

*  database out of service. It is a subtype of Integrity Violation. 

*/
 INTEGRITY_VIOLATION_DATABASE_SYSTEM ,




/**  
* Field OPERATIONAL_VIOLATION
* An indication that the provision of the requested service was not poss 

* ible due to the unavailability, malfunction or incorrect invocation of 

*  the service. 

*/
 OPERATIONAL_VIOLATION ,




/**  
* Field PHYSICAL_VIOLATION
* An indication that a physical resource has been violated in a way that 

*  suggests a security attack. 

*/
 PHYSICAL_VIOLATION ,




/**  
* Field PROCESSING_ERROR_ALARM
* An alarm of this type is associated with a software or processing faul 

* t (ITU T Recommendation X.733). 

*/
 PROCESSING_ERROR_ALARM ,




/**  
* Field QUALITY_OF_SERVICE_ALARM
* An alarm of this type is associated with degradation in the quality of 

*  a service (ITU T Recommendation X.733). 

*/
 QUALITY_OF_SERVICE_ALARM ,




/**  
* Field QUALITY_OF_SERVICE_EQUIPMENT_PERFORMANCE_ALARM
* An alarm of this type is associated with degradation of equipment perf 

* ormance. e.g. system resources overload. It is a subtype of Quality of 

*  Service Alarm 

*/
 QUALITY_OF_SERVICE_EQUIPMENT_PERFORMANCE_ALARM ,




/**  
* Field QUALITY_OF_SERVICE_TRAFFIC_PERFORMANCE_ALARM
* An alarm of this type is associated with degradation of traffic perfor 

* mance. e.g. excessive retransmission rate. It is a subtype of Quality  

* of Service Alarm. 

*/
 QUALITY_OF_SERVICE_TRAFFIC_PERFORMANCE_ALARM ,




/**  
* Field SECURITY_SERVICE_OR_MECHANISM_VIOLATION
* An indication that a security attack has been detected by a security s 

* ervice or mechanism. 

*/
 SECURITY_SERVICE_OR_MECHANISM_VIOLATION ,




/**  
* Field TIME_DOMAIN_VIOLATION
* An indication that an event has occurred at an unexpected or prohibite 

* d time. 

*/
 TIME_DOMAIN_VIOLATION ,




/**  
* Field UNKNOWN
* Event type that cannot be supported by the above definitions. 

*/
 UNKNOWN ,


}