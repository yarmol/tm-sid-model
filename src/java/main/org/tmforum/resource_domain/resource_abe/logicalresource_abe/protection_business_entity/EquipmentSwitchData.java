/**
* Protection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.g.a1DIE.mXE.eCN.m.p.x.w.x3LZL.g-content.html">Protection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protection_business_entity ;

/**
* This data type identifies the current protection switch status of an E 
* quipment Protection Group. 
 @since SID_R16.5
*/ 

public  class EquipmentSwitchData  {



/**  
* Field equipmentProtectionType
* This attribute identifies the type of equipment protection for which t 

* he switch has occurred.</br>The attribute can take on the following va 

* lue:</br>- "M_FOR_N", means that M pieces of equipment protect N piece 

* s of equipment. 

*/
protected EquipmentProtectionType equipmentProtectionType ;




/**  
* Field equipmentSwitchReason
* This attribute contains the reason of the last switch. 

*/
protected EquipmentSwitchReason equipmentSwitchReason ;




/**  
* Field epgRef
* This attribute identifies the Equipment Protection Group for which the 

*  protection switch status is being reported. 

*/
protected ObjectName epgRef ;




/**  
* Field protectedEquipmentRef
* This attribute identifies the name of the protected equipment.</br>In  

* case of an M:N equipment protection type, protectedEquipmentRef always 

*  identifies a worker Equipment object. 

*/
protected ObjectName protectedEquipmentRef ;




/**  
* Field switchToEquipmentRef
* This attribute identifies the Equipment object that is working after t 

* he switch, or currently working if no protection switch is currently a 

* ctive. 

*/
protected ObjectName switchToEquipmentRef ;


}