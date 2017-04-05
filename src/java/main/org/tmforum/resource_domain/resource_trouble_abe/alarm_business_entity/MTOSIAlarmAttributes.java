/**
* Alarm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.e.c.f7AAIWE.eC.gR.b9X.b.l.f.oNQ-content.html">Alarm ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_business_entity ;

/**
* This datatype contains wireline specific alarm attributes coming from  
* MTOSI.It is present to ease migration from MTOSI RTM implementation an 
* d can be considered as conditional for MTOSI.  
 @since SID_R16.5
*/ 

public  class MTOSIAlarmAttributes  {



/**  
* Field affectedPtpRefList
* This attribute identifies all affected associated PTP names. 

*/
protected ObjectName affectedPtpRefList ;




/**  
* Field isEdgePointRelated
* This attribute indicates whether the event is related to a Termination 

*  Point (TP) at the edge of a subnetwork.</br>It is True for edge point 

* s and their contained CTPs although it is always False as a CTP's attr 

* ibute if the CTP doesn't terminate a Topological Link.</br>Note that t 

* he value is True for all notifications reporting a value change of the 

*  TP's attribute 'isEdgePoint' even if the new value is False. 

*/
protected Boolean isEdgePointRelated ;




/**  
* Field layerRate
* This attribute identifies the layer rate to which the Alarm is relevan 

* t to. 

*/
protected LayerRate layerRate ;




/**  
* Field nativeProbableCause
* Represents the probable cause attribute as defined at the source, befo 

* re any normalization. </br>It might be different from the probable cau 

* se if the latter has been normalized by an OSS (EMS or NMS) receiving  

* the alarm. 

*/
protected String nativeProbableCause ;


}