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
* This is an abstract base class that defines the concept of various typ 
* es of roles used in the  model. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity" href="_3E3F0EC000E93CDA9E0C0384-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity</a> @since SID_R16.5
*/ 

public abstract class Role extends RootEntity {



/**  
* Field roleCombination
* A roleCombination is an array of string attributes that are used to id 

* entify and potentially select one or more policies for a set of manage 

* d entities from among a much larger set of available policies.</br></b 

* r>Values of this attribute should be entered in comma separated value  

* format; white space should be ignored.</br> 

*/
protected String roleCombination ;




/**  
* Field roleSelectionMethod
* This is an enumerated integer that defines the precise means used to s 

* elect one or more entities which map to one or more roles contained in 

*  the roleCombination attribute of this object. Values include:</br></b 

* r> 0: retrieve all</br> 1: retrieve intersection</br></br>For exampe,  

* assume that there is an external query engine that is looking for the  

* roles edge or ethernet. The result of this query will look at the role 

* Combination and roleSelectionMethod attributes of each managed object  

* that it is querying.</br></br>If the value of this attribute is 0, the 

* n all managed objects that have their roleCombination set to either {e 

* dge}, {ethernet}, or {edge, ethernet} will be retrieved. In contrast,  

* if the value of this attribute is 1, then only those managed objects w 

* hose roleCombination attribute is set to {edge, ethernet} will be retr 

* ieved.</br> 

*/
protected Integer roleSelectionMethod ;




/**  
* Field specificationRole
*/
protected RoleSpecification specificationRole ;


}