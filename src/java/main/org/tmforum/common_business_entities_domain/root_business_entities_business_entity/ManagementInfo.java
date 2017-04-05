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
* This is an abstract base class that is used to represent entities that 
*  represent management information obtained in a managed environment .  
* Specifically, in the process of managing an entity, information of var 
* ious forms are created. This class is the base class for defining diff 
* erent types of management information.The design of how management inf 
* ormation is obtained uses this class to gather specific type of inform 
* ation, and the ManagementMethodEntity class to obtain the desired data 
*  using an appropriate method. This combination of class hierarchies en 
* ables different management methods (e.g., CLI vs. SNMP) to be used to  
* gather different types of management data, and is unique to the SID in 
* formation model. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity" href="_3E3F0EC000E93DDE84EE01B9-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity</a> |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity" href="_3E3F0EC000E93CDA9E0C0384-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity</a> @since SID_R16.5
*/ 

public abstract class ManagementInfo extends Entity {



/**  
* Field mgmtInfoValidFor
* This attribute defines the time period that this management informatio 

* n is valid for. A TimePeriod is a complex datatype, that has a startin 

* g time and an ending time. 

*/
protected TimePeriod mgmtInfoValidFor ;




/**  
* Field retrievalMethodCurrent
* This is an enumerated integer that defines the particular type of meth 

* od that is currently being used to retrieve the management information 

* . Values include:</br></br> 0: Unknown</br> 1: None</br> 2: CLI</br> 3 

* : SNMP</br> 4: TL1</br> 5: CMIP</br> 6: RMON</br> 7: Proprietary</br>< 

* /br>None could mean that this ManagedEntity performs a set function an 

* d is not configurable, as well as mean that this ManagedEntity is not  

* configurable except by the factory.</br> 

*/
protected Integer retrievalMethodCurrent ;




/**  
* Field retrievalMethodsSupported
* This is an array of integers that define the different means of retrie 

* ving management methods that are supported by this object. Values incl 

* ude:</br> </br> 0: Unknown</br> 1: None</br> 2: CLI</br> 3: SNMP</br>  

* 4: TL1</br> 5: CMIP</br> 6: RMON</br> 7: Proprietary</br></br>None cou 

* ld mean that this ManagedEntity performs a set function and is not con 

* figurable, as well as mean that this ManagedEntity is not configurable 

*  except by the factory.</br> 

*/
protected String retrievalMethodsSupported ;




/**  
* Field managedEntity
*/
protected ManagedEntity managedEntity ;




/**  
* Field device
*/
protected Device device ;


}