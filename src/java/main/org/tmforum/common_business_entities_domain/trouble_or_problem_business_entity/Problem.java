/**
* Trouble or Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_Q.d.lB.kP.a6E.d2F.u5.zG43E.t.pQ-content.html">Trouble or Problem ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.trouble_or_problem_business_entity ;

/**
* General description of a problem that can be shared between service an 
* d customer. A Problem is an indication that an entity is no longer fun 
* ctioning according to the agreement with its client(s).  
 @since SID_R16.5
*/ 

public abstract class Problem  {



/**  
* Field problemId
* Identifier of the problem. Note that this identifier is local to the s 

* erver side of the interface. </br>Only EntityIdentifier can be conside 

* red as global. 

*/
protected String problemId ;




/**  
* Field originatingSytem
* Indicates where the problem was generated. 

*/
protected String originatingSytem ;




/**  
* Field impactImportanceFactor
*/
protected Integer impactImportanceFactor ;




/**  
* Field priority
* An indication varying from 1 to 10 of how important it is for the serv 

* ice provider to correct the Service Problem. The priority can be chang 

* ed by the human operator while the impact importance can only be chang 

* ed by the system which determines the impact. </br> 

*/
protected Integer priority ;




/**  
* Field description
* Free form text describing the Service Problem. 

*/
protected String description ;




/**  
* Field firstAlert
*/
protected String firstAlert ;




/**  
* Field category
* classifier for the problem. Settable. Structured text/ enum.</br>In th 

* e ATIS Service Outage document, the What Category</br>corresponds to t 

* his attribute and the values can be used as possible values. 

*/
protected String category ;




/**  
* Field responsibleParty
*/
protected String responsibleParty ;




/**  
* Field problemEscalation
* Indicates if this service problem has been escalated or not. Possible  

* values are 0 to 10. A value of zero means no escalation. </br>The mean 

* ings of values 1-10 are to be determined by the user of the interface, 

*  but they show increasing levels of escalation. </br> 

*/
protected Integer problemEscalation ;




/**  
* Field comments
* Comments on problem, as a list of comments. 

*/
protected List<Object> comments ;




/**  
* Field timeRaised
* Time the problem was raised 

*/
protected Object timeRaised ;




/**  
* Field timeChanged
* Time the problem was last changed 

*/
protected Object timeChanged ;




/**  
* Field reason
* Free text or optionally structured text. It can be Unknown. The Why ca 

* tegory of the ATIS Service Outage document can be used to fill this va 

* lue. 

*/
protected String reason ;




/**  
* Field underlyingProblems
*/
protected List<Problem> underlyingProblems ;




/**  
* Field parentProblems
*/
protected List<Problem> parentProblems ;




/**  
* Field ackStatus
* Acknowledgement status 

*/
protected AckStatus ackStatus ;




/**  
* Field clearStatus
* Clear status of the problem. </br>Clearance of the resource RC alarm o 

* r of the underlying alarms or problems does not imply clearance of the 

*  problem. </br> 

*/
protected ClearStatus clearStatus ;




/**  
* Field activityStatus
* Activity status, indicates if the problem is historical or active 

*/
protected ActivityStatusEnum activityStatus ;




/**  
* Field impactPattterns
* Define the patterns of impact (optional) </br>- e.g. other service cha 

* racteristics </br>- Used when defining impact through another pattern  

* than the pre-defined attributes above </br> </br>This field is extenda 

* ble. 

*/
protected ImpactPatterns impactPattterns ;




/**  
* Field trackingRecords
*/
protected List<TrackingRecord> trackingRecords ;




/**  
* Field affectedLocations
*/
protected List<GeographicPlace> affectedLocations ;




/**  
* Field associatedTroubleTickets
*/
protected List<TroubleTicket> associatedTroubleTickets ;




/**  
* Field rootCauseServices
*/
protected List<Service> rootCauseServices ;




/**  
* Field rootCauseResources
*/
protected List<Resource> rootCauseResources ;


}