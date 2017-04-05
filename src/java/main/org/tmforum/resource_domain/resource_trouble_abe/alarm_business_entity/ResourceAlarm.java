/**
* Alarm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.e.c.f7AAIWE.eC.gR.b9X.b.l.f.oNQ-content.html">Alarm ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_business_entity ;

/**
* The ResourceAlarm entity contains information about a given alarm cond 
* ition of an alarmed Managed Object.Note that the automatic Object Crea 
* tion notification generation is disabled as a specific New Alarm notif 
* ication is generated for a new alarm. 
 @since SID_R16.5
*/ 

public  class ResourceAlarm  {



/**  
* Field alarmId
* Local identifier of the Alarm. Note that this identifier is local to t 

* he server side of the interface, i.e. the alarm-owning system. </br>On 

* ly EntityIdentifier can be considered as global.</br></br>This attribu 

* te is mandatory in all 3 profiles. 

*/
protected String alarmId ;




/**  
* Field alarmType
* Categorizes the alarm.</br></br>This attribute is mandatory in all 3 p 

* rofiles. 

*/
protected AlarmType alarmType ;




/**  
* Field perceivedSeverity
* Lists the possible severities that can be allocated to an Alarm. The v 

* alues are consistent with ITU-T Recommendation X.733.</br>Once an alar 

* m has been cleared, its perceived severity is set to Cleared and can n 

* o longer be set. </br></br>This attribute is mandatory in all 3 profil 

* es. 

*/
protected PerceivedSeverity perceivedSeverity ;




/**  
* Field probableCause
* Further qualifies the alarm in complement of the alarmType. This speci 

* fication does not use an enumeration, but a string with qualified text 

* . Recommended values are specified in TMF063 Probable Causes Technical 

*  Specification.</br></br>This attribute is mandatory in all 3 profiles 

* . 

*/
protected String probableCause ;




/**  
* Field specificProblem
* Further qualifies the alarm in addition to the probableCause. This att 

* ribute is defined as a string. Values are defined by vendors. </br></b 

* r>This attribute is optional in all 3 profiles. 

*/
protected String specificProblem ;




/**  
* Field managedObjectClass
* Identifies, in terms of object class, the resource that is in alarm.</ 

* br></br>This attribute is mandatory in all 3 profiles.</br> 

*/
protected String managedObjectClass ;




/**  
* Field alarmRaisedTime
* Indicates the time (as a date + time) at which the alarm occurred.</br 

* ></br>This attribute is mandatory in all 3 profiles. 

*/
protected DateTime alarmRaisedTime ;




/**  
* Field alarmClearedTime
* Indicates the time (as a date + time) at which  the alarm is cleared.< 

* /br>Note that the automatic AVC notification generation is disabled fo 

* r this attribute as a specific notification is generated for alarm cle 

* arance.  </br></br>It is not filled on an alarm for which the clearanc 

* e has not been received, but it is mandatory for a cleared alarm.</br> 

* This attribute is mandatory in all 3 profiles. 

*/
protected DateTime alarmClearedTime ;




/**  
* Field proposedRepairActions
* Indicates proposed repair actions, if known to the system emitting the 

*  alarm.</br></br>This attribute is optional in all 3 profiles. 

*/
protected String proposedRepairActions ;




/**  
* Field additionalText
* Contains further information on the alarm. Vendors should avoid using  

* this field to put additional information identifying the alarmed objec 

* t or the specific problem. The corresponding fields should be use for  

* better alarm quality. </br></br>This attribute is optional in all 3 pr 

* ofiles.</br> 

*/
protected String additionalText ;




/**  
* Field alarmReportingTime
* Indicates the time (as a date + time) at which the alarm was reported  

* by the owning system. </br></br>It might be different from the alarmRa 

* isedTime. For instance, if the alarm list is maintained by an EMS, the 

*  alarmRaisedtime would be the time the alarm was detected by the NE, w 

* hile the alarmReportingTime would be the time this alarm was stored in 

*  the alarm list of the EMS.</br></br>This attribute is not supported i 

* n the Simple Alarm Reporting profile and optional in the Standard and  

* Enhanced profiles. 

*/
protected DateTime alarmReportingTime ;




/**  
* Field alarmChangedTime
* Indicates the last date and time when the alarm is changed on the alar 

* m-owning system. Any change to the alarm whether coming from the alarm 

* ed resource, or triggered by a change from the client is changing this 

*  time. </br></br>This attribute is not supported in the Simple Alarm R 

* eporting profile and optional in the Standard and Enhanced profiles. 

*/
protected DateTime alarmChangedTime ;




/**  
* Field systemDN
* Identifies the alarm-owning system, i.e. the one owning the alarm list 

* . </br></br>This attribute is not supported in the Simple Alarm Report 

* ing profile, optional in the Standard profile and mandatory in the Enh 

* anced profile. 

*/
protected String systemDN ;




/**  
* Field ackState
* Provides the Acknowledgement State of the alarm. </br>Note that the au 

* tomatic AVC notification generation is disabled for this attribute as  

* a specific notification is generated for acknowledgement state change. 

*   </br>If the acknowledgeResourceAlarms is supported, then this attrib 

* ute shall also be supported. </br></br>This attribute is not supported 

*  in the Simple Alarm Reporting profile and optional in the Standard an 

* d Enhanced profiles. 

*/
protected AckStatus ackState ;




/**  
* Field ackTime
* Provides the time when the alarm has been last acknowledged or unackno 

* wledged.</br>Note that the automatic AVC notification generation is di 

* sabled for this attribute as a specific notification is generated for  

* acknowledgement state change.  </br>If the acknowledgeResourceAlarms i 

* s supported, then this attribute shall also be supported. </br></br>Th 

* is attribute is not supported in the Simple Alarm Reporting profile an 

* d optional in the Standard and Enhanced profiles. 

*/
protected DateTime ackTime ;




/**  
* Field ackUserId
* Provides the id of the user who has last changed the ack state of the  

* alarm,  i.e. acknowledged or unacknowledged the alarm.</br>Note that t 

* he automatic AVC notification generation is disabled for this attribut 

* e as a specific notification is generated for acknowledgement state ch 

* ange.  </br>If the acknowledgeResourceAlarms is supported, then this a 

* ttribute shall also be supported. </br></br>This attribute is not supp 

* orted in the Simple Alarm Reporting profile and optional in the Standa 

* rd and Enhanced profiles.</br> 

*/
protected String ackUserId ;




/**  
* Field ackSystemId
* Provides the name of the system that last changed the ackState of an a 

* larm, i.e. acknowledged or unacknowledged the alarm.</br>Note that the 

*  automatic AVC notification generation is disabled for this attribute  

* as a specific notification is generated for acknowledgement state chan 

* ge.  </br>If the acknowledgeResourceAlarms is supported, then this att 

* ribute is optional. </br></br>This attribute is not supported in the S 

* imple Alarm Reporting profile and optional in the Standard and Enhance 

* d profiles. 

*/
protected String ackSystemId ;




/**  
* Field clearUserId
* Provides the id of the user who invoked the clearResourceAlarm operati 

* on.</br>Note that the automatic AVC notification generation is disable 

* d for this attribute as a specific notification is generated for alarm 

*  clearance.  </br></br>This attribute is not supported in the Simple A 

* larm Reporting profile and optional in the Standard and Enhanced profi 

* les. 

*/
protected String clearUserId ;




/**  
* Field clearSystemId
* Provides the id of the system where the user who invoked the clearReso 

* urceAlarm operation is located. This might be different from the alarm 

* -owning system. </br>Note that the automatic AVC notification generati 

* on is disabled for this attribute as a specific notification is genera 

* ted for alarm clearance.  </br></br>This attribute is not supported in 

*  the Simple Alarm Reporting profile and optional in the Standard and E 

* nhanced profiles. 

*/
protected String clearSystemId ;




/**  
* Field backedUpStatus
* Indicates if the Managed Object (related to this alarm) has a back up  

* or has been backed up. </br></br>This attribute is not supported in th 

* e Simple Alarm Reporting profile and optional in the Standard and Enha 

* nced profiles. 

*/
protected Boolean backedUpStatus ;




/**  
* Field trendIndication
* Indicates the current severity trend of the Managed Object (related to 

*  this alarm).</br></br>This attribute is not supported in the Simple A 

* larm Reporting profile and optional in the Standard and Enhanced profi 

* les. 

*/
protected TrendIndicator trendIndication ;




/**  
* Field plannedOutageIndication
* Indicates that the Managed Object (related to this alarm) is in planne 

* d outage (in planned maintenance, or out-of-service). This might also  

* be used when an equipment is being commissioned to avoid the alarms pr 

* opagating to other systems.</br></br>This attribute is not supported i 

* n the Simple Alarm Reporting profile and optional in the Standard and  

* Enhanced profiles. 

*/
protected PlannedOutageIndicator plannedOutageIndication ;




/**  
* Field alarmEscalation
* Indicates if this alarm has been escalated or not. Possible values are 

*  0 to 10. A value of zero means no escalation.</br>The meanings of val 

* ues 1-10 are to be determined by the user of the interface, but they s 

* how increasing levels of escalation.</br></br>This attribute is not su 

* pported in the Simple Alarm Reporting profile and optional in the Stan 

* dard and Enhanced profiles. 

*/
protected Integer alarmEscalation ;




/**  
* Field serviceAffecting
* Provides the alarm-owning system determination of whether or not the a 

* larm affects service.  </br></br>This attribute is not supported in th 

* e Simple Alarm Reporting profile and optional in the Standard and Enha 

* nced profiles. 

*/
protected ServiceAffectingIndicator serviceAffecting ;




/**  
* Field potentialRootCauseIndication
* Indicates whether an alarm is a raw (uncorrelated) alarm (when false)  

* or a potential root cause alarm indication (when true).</br></br>A fau 

* lt has typically one root cause, but identifying the true root cause o 

* f a fault might be difficult. However, with the scope of an alarm-owni 

* ng system, it might possible to identify a potential root cause indica 

* tion that might be useful for client systems.</br></br>This attribute  

* is not supported in the Simple Alarm Reporting profile and optional in 

*  the Standard and Enhanced profiles.</br> 

*/
protected Boolean potentialRootCauseIndication ;




/**  
* Field parentAlarms
* It indicates the parent alarms for this alarm  from a correlation poin 

* t of view. </br>An alarm can be correlated to one or more underlying a 

* larms. There might be multiple levels of alarm correlation and an unde 

* rlying alarm in one relation can be itself a parent alarm for other un 

* derlying alarms. </br></br>This attribute is not supported in the Simp 

* le Alarm Reporting profile and optional in the Standard and Enhanced p 

* rofiles.</br> 

*/
protected List<ResourceAlarm> parentAlarms ;




/**  
* Field underlyingAlarms
* It indicates the alarms attached to this alarm as underlying alarms fr 

* om a correlation point of view. </br>An alarm can be correlated to one 

*  or more underlying alarms. There might be multiple levels of alarm co 

* rrelation and an underlying alarm in one relation can be itself a pare 

* nt alarm for other underlying alarms. </br></br>This attribute is not  

* supported in the Simple Alarm Reporting profile and optional in the St 

* andard and Enhanced profiles.</br> 

*/
protected List<ResourceAlarm> underlyingAlarms ;




/**  
* Field trackingRecord
*  Allows the tracking of modifications on the alarm. The tracking recor 

* ds should not be returned by default with the alarm to allow retrievin 

* g the alarm without the tracking records. Whether the tracking records 

*  is stored with the alarm or outside of it is implementation specific. 

* </br></br>This attribute is not supported in the Simple Alarm Reportin 

* g profile and optional in the Standard and Enhanced profiles. 

*/
protected List<TrackingRecord> trackingRecord ;




/**  
* Field mtosiSpecificAlarmAttributes
* This attribute groups wireline specific alarm attributes coming from M 

* TOSI.</br></br>It is present to ease migration from MTOSI RTM implemen 

* tation and can be considered as conditional for MTOSI. </br></br>This  

* attribute is not supported in the Simple Alarm Reporting profile and o 

* ptional in the Standard and Enhanced profiles. 

*/
protected MTOSIAlarmAttributes mtosiSpecificAlarmAttributes ;




/**  
* Field crossedThresholdInformation
* Identifies the details of the threshold that has been crossed. </br>Mu 

* ltiple values are possible in case of multiple threshold crossing appl 

* ying to the same threshold id. The ThresholdInfo corresponding to the  

* clearance can also be recorded in the original alarm for completeness. 

*  </br></br>This attribute is optional in all 3 profiles.  

*/
protected List<CrossedThreshold> crossedThresholdInformation ;




/**  
* Field securityServiceProvider
* Identifies the service provider whose service request provokes the gen 

* eration of the security alarm. </br></br>This attribute is not support 

* ed in the Simple Alarm Reporting profile and optional in the Standard  

* and Enhanced profiles. 

*/
protected PartyRole securityServiceProvider ;




/**  
* Field monitoredAttributes
* The Monitored Attributes parameter, when present, defines one or more  

* attributes of the Managed Object (related to this alarm) and their cor 

* responding values at the time of the alarm.  Managed object definers m 

* ay specify the set of attributes which are of interest, if any.  This  

* allows, for example, the timely reporting of changing conditions preva 

* lent at the time of the alarm.</br></br>This attribute is not supporte 

* d in the Simple Alarm Reporting profile and optional in the Standard a 

* nd Enhanced profiles. 

*/
protected List<CharacteristicValue> monitoredAttributes ;




/**  
* Field managedObjectInstance
* Identifies, in terms of object instance, the resource that is in alarm 

* .</br></br>This attribute is mandatory in all 3 profiles. 

*/
protected Resource managedObjectInstance ;




/**  
* Field backUpObject
* In case the Managed Object (related to this alarm) has a back up, it s 

* pecifies the value of the object providing the back-up.</br></br>This  

* attribute is not supported in the Simple Alarm Reporting profile and o 

* ptional in the Standard and Enhanced profiles. 

*/
protected Resource backUpObject ;




/**  
* Field securityServiceUser
* Identifies the service user whose request for service led to the gener 

* ation of the security alarm.</br></br>This attribute is not supported  

* in the Simple Alarm Reporting profile and optional in the Standard and 

*  Enhanced profiles. 

*/
protected PartyRole securityServiceUser ;




/**  
* Field alarmDetector
* Provides the identity of the detector of the alarm. </br>This attribut 

* e can also be used for non security alarms, when the object detecting  

* the problem is not the Managed Object related to the alarm. </br></br> 

* This attribute is not supported in the Simple Alarm Reporting profile  

* and optional in the Standard and Enhanced profiles. 

*/
protected Resource alarmDetector ;




/**  
* Field comments
* Indicates the comments entered on the alarm, as a list.</br>If the com 

* mentResourceAlarms is supported, then this attribute shall also be sup 

* ported. </br></br>This attribute is not supported in the Simple Alarm  

* Reporting profile and optional in the Standard and Enhanced profiles. 

*/
protected List<Comment> comments ;


}