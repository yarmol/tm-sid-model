/**
* Protection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.g.a1DIE.mXE.eCN.m.p.x.w.x3LZL.g-content.html">Protection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protection_business_entity ;

/**
* This enumeration reflects the reason why a switch occurred. 
 @since SID_R16.5
*/ 

public  enum EquipmentSwitchReason  {



/**  
* Field EQUIPMENT_FAILURE
* EQUIPMENT_FAILURE is used when an instance of equipment has failed. 

*/
 EQUIPMENT_FAILURE ,




/**  
* Field MANUAL
* MANUAL indicates a switch that was requested by the operator and inclu 

* des forced switches. 

*/
 MANUAL ,




/**  
* Field NOT_APPLICABLE
* NOT_APPLICABLE is used, if a more precise value is not available. 

*/
 NOT_APPLICABLE ,


}