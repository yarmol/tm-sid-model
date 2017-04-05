/**
* Root Business Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93CF68FE80295-content.html">Root Business Entities ABE</a> 
* A set of common business entities that collectively serve as the found 
* ation of the business view. This set of entities enables the entities  
* in different domains of the SID Framework to be associated with each o 
* ther, providing greater overall coherence to the information framework 
* . 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_business_entity ;

/**
* A ManagedEntity is used to specify that an Entity is manageable by ele 
* ctronic means.It may produce and/or consume other ManagedEntities, and 
*  has a distinct state. A ManagedEntity may concern a simple concept, s 
* uch as a logical point of communication, or a complex concept, such as 
*  an Application or System. 
 @since SID_R16.5
*/ 

public abstract class ManagedEntity  {



/**  
* Field policyApplication
*/
protected List<PolicyApplication> policyApplication ;




/**  
* Field policyEnforcementPoint
*/
protected List<PolicyEnforcementPoint> policyEnforcementPoint ;




/**  
* Field policyDecisionPoint
*/
protected List<PolicyDecisionPoint> policyDecisionPoint ;




/**  
* Field collection
*/
protected Collection collection ;




/**  
* Field managementMethodCurrent
* This is an enumerated integer that defines the particular type of mana 

* gement method that is currently being used. </br></br>Permitted Values 

* :</br> 0: Unknown</br> 1: None</br> 2: CLI</br> 3: SNMP</br> 4: TL1</b 

* r> 5: CMIP</br> 6: Proprietary</br></br>Notes:No analog in M.3100 or t 

* he DMTF CIM.</br> 

*/
protected Integer managementMethodCurrent ;




/**  
* Field managementMethodSupported
* This is an array of integers that define the different management meth 

* ods that are supported by this object. </br></br>Permitted Values:</br 

* > </br> 0: Unknown</br> 1: None</br> 2: CLI</br> 3: SNMP</br> 4: TL1</ 

* br> 5: CMIP</br> 6: Proprietary</br></br>Notes:</br></br>No analog in  

* M.3100 or the DMTF CIM. 

*/
protected Integer managementMethodSupported ;




/**  
* Field managementDomain
*/
protected List<ManagementDomain> managementDomain ;




/**  
* Field managementInfo
*/
protected List<ManagementInfo> managementInfo ;




/**  
* Field managementMethodEntity
*/
protected ManagementMethodEntity managementMethodEntity ;




/**  
* Field entity
*/
protected Entity entity ;




/**  
* Field commonObjectInfo
*/
protected CommonObjectInfo commonObjectInfo ;


}