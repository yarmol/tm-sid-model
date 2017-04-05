/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This is an abstract base class for defining a standard set of PolicyVa 
* riable objects that are common to most PBNM applications. This is the  
* superclass for a standard set of PolicyVariable subclasses that are pa 
* rt of the model. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class VariableStandard extends PolicyVariable,Policy,RootEntity {



/**  
* Field allowedValueTypes
* This is an array of string attributes that define the set of class nam 

* es (which correspond to a set of datatypes) that are allowed to be use 

* d in conjunction with this PolicyVariable. Each string provides a clas 

* s name, which corresponds to a particular subclass of PolicyValue. Eac 

* h allowed subclass defines an object with a compatible datatype and se 

* mantics.</br></br>Notes: Not present in the ITU or CIM specs. The IETF 

*  RFCs only define “MATCH”. 

*/
protected String allowedValueTypes ;


}