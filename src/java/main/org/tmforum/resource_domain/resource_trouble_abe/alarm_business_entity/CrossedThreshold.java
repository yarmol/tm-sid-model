/**
* Alarm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.e.c.f7AAIWE.eC.gR.b9X.b.l.f.oNQ-content.html">Alarm ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_business_entity ;

/**
* This class provides crossed threshold information when the alarm is a  
* result of crossing a threshold.It is an implementation-oriented object 
* , since the information it provides is a summary of information contai 
* ned in other SID entities.  It consists of :- Threshold Id, identifyin 
* g the threshold that caused the alarm- Indicator Name, identifying the 
*  name of performance indicator which crossed the threshold- Observed V 
* alue, providing the value of the performance indicator which crossed t 
* he threshold- Granularity, providing the granularity at which the indi 
* cator is evaluated for threshold crossing- Direction, providing the th 
* reshold crossing direction: up or down- ThresholdQualifier, qualifying 
*  the crossed threshold- Threshold Crossing Description, containing fur 
* ther information on the threshold crossing alarm.Note that some of the 
*  information present in the Threshold object , like indicator name or  
* granularity is repeated here in order to have a contained alarm report 
* .  
 @since SID_R16.5
*/ 

public  class CrossedThreshold  {



/**  
* Field thresholdId
* Indicates the identifier of the threshold that caused the alarm.</br> 

*/
protected String thresholdId ;




/**  
* Field indicatorName
* Indicates the  name of performance indicator, KPI, gauge or counter wh 

* ich crossed the threshold. </br></br>If the threshold applies to a sin 

* gle indicator, then this attribute is mandatory. It can only be omitte 

* d for complex threshold involving multiple indicators. </br> 

*/
protected String indicatorName ;




/**  
* Field observedValue
* Indicates the observed value: the value of the indicator which crossed 

*  the threshold.  This may be different from the threshold value if, fo 

* r example, the indicator is a gauge and this gauge only takes on discr 

* ete values.</br></br>If the threshold applies to a single indicator, t 

* hen this attribute is mandatory. It can only be omitted for complex th 

* reshold involving multiple indicators.  

*/
protected Float observedValue ;




/**  
* Field granularity
* Indicates the granularity at which the indicator is evaluated for thre 

* shold crossing.</br></br>If the threshold applies to a single indicato 

* r, then this attribute is mandatory. It can only be omitted for comple 

* x threshold involving multiple indicators. 

*/
protected Granularity granularity ;




/**  
* Field direction
* Indicates the threshold crossing direction: up or down.</br></br>If th 

* e threshold applies to a single indicator, then this attribute is mand 

* atory. It can only be omitted for complex threshold involving multiple 

*  indicators.  

*/
protected ThresholdCrossingDirection direction ;




/**  
* Field thresholdCrossingDescription
* Contains further information on the threshold crossing alarm. Vendors  

* should avoid using this field to put additional information identifyin 

* g the indicator or the threshold id. The corresponding fields should b 

* e use for better alarm quality.</br></br>For complex thresholds involv 

* ing multiple indicators, this field is required to provide a textual d 

* escription of the threshold crossing condition.  

*/
protected String thresholdCrossingDescription ;




/**  
* Field indicatorUnit
* This attribute identifies the unit of the measurement of the indicator 

*  corresponding to the threshold that has been crossed in a free format 

*  string. 

*/
protected String indicatorUnit ;




/**  
* Field thresholdQualifier
* This attribute contains a set of name/ value pairs used to qualify the 

*  crossed threshold. </br></br>When migrating from MTOSI, this attribut 

* e can contain the pmLocation and the thresholdType. </br>For pmLocatio 

* n, the name would be pmLocation and the values would be Contra_Near_En 

* d_Rx, Contra_Far_End_Rx, Near_End_Rx, Near_End_Tx, Far_End_Rx, Far_End 

* _Tx, Bidirectional.</br>For thresholdType, the name is thresholdType a 

* nd the possible values are Low, Lowest, Highest and High.  

*/
protected List<AttributeValuePair> thresholdQualifier ;


}