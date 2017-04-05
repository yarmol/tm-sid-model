/**
* Protection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.g.a1DIE.mXE.eCN.m.p.x.w.x3LZL.g-content.html">Protection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protection_business_entity ;

/**
* This object class represents the information about a trail protection  
* in a Managed Element. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ProtectionGroup extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field type
* This attribute identifies the type of the Protection Group. 

*/
protected ProtectionGroupType type ;




/**  
* Field protectionSchemeState
* This attribute identifies the state in which the protection scheme is  

* in. FORCED_OR_LOCKED_OUT indicates that the entire group is locked; pa 

* rtial locking is indicated by AUTOMATIC.</br>Individual locks can be r 

* eported through transmission parameters on the appropriate TPs. 

*/
protected ProtectionSchemeState protectionSchemeState ;




/**  
* Field reversionMode
* This attribute identifies whether the switch is revertive or not.</br> 

* The default value depends on the protection group implementation 

*/
protected ReversionMode reversionMode ;




/**  
* Field layerRate
* This attribute identifies the line rate of the TPs of the Protection G 

* roup. 

*/
protected LayerRate layerRate ;




/**  
* Field parameterList
* This attribute identifies any protection group specific parameters. No 

* n-applicable parameters and parameters for which the value is unknown  

* to the target OS may be left out.</br>See attached SD1-29_PGPParameter 

* s supporting document for values and descriptions. 

*/
protected List<AttributeValuePair> parameterList ;




/**  
* Field apsProtocolType
* This attribute defines the APS protocol on which the switching functio 

* n is based on.</br></br>Possible values:</br>- "G.783" in case of K1/K 

* 2 based APS</br>- "Legacy" in case of proprietary APS protocol, as for 

*  radio equipment.</br></br>No default value 

*/
protected String apsProtocolType ;




/**  
* Field ituArcStateAndStatusList
* See supporting document SD1-8_encodingX731M3100. 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field asapRef
* This attribute indicates the assignment of an Alarm Severity Assigneme 

* nt Profile (ASAP) to the Protection Group. 

*/
protected AlarmSeverityAssignmentProfile asapRef ;




/**  
* Field protectionRelatedTps
* This attribute contains the list of PTPs that belong in the Protection 

*  Group. The list of PTPs is partially ordered. The protecting PTP alwa 

* ys trails its worker PTPs. The East PTPs are always contiguous in the  

* list, as well as West PTPs.</br></br>At least 2 values. 

*/
protected TIPTerminationPoint protectionRelatedTps ;




/**  
* Field groupedTpeRefList
*/
protected TerminationPointEncapsulation groupedTpeRefList ;


}