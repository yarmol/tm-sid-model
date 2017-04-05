/**
* External System Capability ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_DRUAAK05E.e.a.zDMG.f.zT.b.l9.g-content.html">External System Capability ABE</a> 
* A collection of entities that can be used to define external system ca 
* pabilities like fulfillment, charging, assurance, policy and billing. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.external_system_capability_business_entity ;

/**
* This abstract class defines capabilities like charging, billing, fulfi 
* llment, policy and assurance supported by an external system. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ExternalSystemCapability extends EntitySpecification,RootEntity {



/**  
* Field systemID
* Unique system identifier providing the capability. 

*/
protected String systemID ;




/**  
* Field capabilityType
* Capability type like policy, charging and so on. 

*/
protected String capabilityType ;




/**  
* Field version
* The version given to the system capability. This may include subfileds 

*  like major and minor which are separated by a period delimiter. 

*/
protected String version ;




/**  
* Field validFor
* The period for which the ExternalSystemCapability is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field entitySpecification
*/
protected List<EntitySpecification> entitySpecification ;


}