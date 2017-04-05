/**
* Protection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.g.a1DIE.mXE.eCN.m.p.x.w.x3LZL.g-content.html">Protection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protection_business_entity ;

/**
* This object class represents the information about an equipment protec 
* tion in a Managed Element. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class EquipmentProtectionGroup extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field type
* This attribute defines the type of scheme this group represents (so fa 

* r, only  M:N equipment protection has been identified). 

*/
protected EquipmentProtectionType type ;




/**  
* Field protectionSchemeState
* This attribute indicates whether the protection scheme is active or fr 

* ozen locked out because of a forced switch command. This is an indicat 

* or whether the protection scheme is free to switch or is in a state wh 

* ere it cannot switch freely, without an explicit clear command applied 

*  to the protection scheme. FORCED_OR_LOCKED_OUT indicates that the ent 

* ire group is locked; partial locking is indicated by AUTOMATIC (partia 

* l locking could be done via operation PerformProtectionCommand in CTP) 

* . 

*/
protected ProtectionSchemeState protectionSchemeState ;




/**  
* Field reversionMode
* This attribute defines whether the protection scheme is revertive or n 

* ot. 

*/
protected ReversionMode reversionMode ;




/**  
* Field parameterList
* This attribute contains a name value list of the associated parameters 

*  for the equipment protection group.</br>No equipment Protection Group 

*  parameters have been identified. 

*/
protected List<AttributeValuePair> parameterList ;




/**  
* Field ituArcStateAndStatusList
* See supporting document SD1-8_encodingX731M3100. 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field asapRef
* This attribute indicates the assignment of an Alarm Severity Assigneme 

* nt Profile (ASAP) to the Equipment Protection Group. 

*/
protected AlarmSeverityAssignmentProfile asapRef ;




/**  
* Field protectedEquipments
* This object class represents the information about an equipment protec 

* tion in a Managed Element. 

*/
protected List<PhysicalResource> protectedEquipments ;




/**  
* Field protectingEquipments
*/
protected List<PhysicalResource> protectingEquipments ;


}