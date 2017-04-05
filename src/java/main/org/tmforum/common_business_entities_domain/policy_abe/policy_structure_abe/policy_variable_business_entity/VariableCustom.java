/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* There are two subclasses of PolicyVariable, called VariableCustom and  
* VariableStandard. The VariableCustom class defines a set of standardiz 
* ed policy variables for use in an application-specific manner. The ter 
* m "custom" means that such variables are explicitly designed to work w 
* ith attributes that are not in any VariableStandard subclasses.This is 
*  an abstract base class that provides two basic attributes to define c 
* ustom variables that can be used in an application-specific fashion. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class VariableCustom extends PolicyVariable,Policy,RootEntity {



/**  
* Field variableModelAttribute
* This is a string attribute that defines the name of the attribute with 

* in the class specified in the variableModelClass attribute that is to  

* be evaluated or set as a PolicyVariable. This enables the VariableCust 

* om class to point to other attributes of other classes that can be def 

* ined as extensions of the standard model.</br></br>Notes: Not present  

* in the ITU or CIM specs. The IETF RFCs only define “MATCH”. 

*/
protected String variableModelAttribute ;




/**  
* Field variableModelClass
* This is a string attribute that defines the class name whose attribute 

*  is to be evaluated or set as a PolicyVariable. This enables the Varia 

* bleCustom class to point to other attributes of other classes that can 

*  be defined as extensions of the standard  model.</br></br>Notes: Not  

* present in the ITU or CIM specs. The IETF RFCs only define “MATCH”. 

*/
protected String variableModelClass ;


}