/**
* Policy Value ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C7FB02EE-content.html">Policy Value ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_value_business_entity ;

/**
* ValueCustom is an abstract base class that provides two basic attribut 
* es to define custom value objects that can be used in an application-s 
* pecific fashion. These two attributes are called valueModelAttribute a 
* nd valueModelClass. The valueModelAttribute is a string attribute that 
*  defines the name of the attribute within the class specified in the v 
* alueModelClass attribute that is to be evaluated or set as a PolicyVal 
* ue. The valueModelClass is a string attribute that defines the class n 
* ame whose attribute is to be evaluated or set as a PolicyValue. This c 
* ombination enables new custom subclasses of ValueCustom to be defined  
* that specify the class and attribute that they are modeling. These new 
*  subclasses can be found by users of the current schema by searching f 
* or these two properties. That also enables SID users to immediately un 
* derstand the purpose of new extensions. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue" href="_3E3F0EC000E93D77E58C02A7-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ValueCustom extends PolicyValue,Policy,RootEntity {



/**  
* Field valueModelAttribute
* This is a string attribute that defines the name of the attribute with 

* in the class specified in the valueModelClass attribute that is to be  

* evaluated or set as a PolicyValue.</br></br>Notes: Not present in the  

* ITU or CIM specs. 

*/
protected String valueModelAttribute ;




/**  
* Field valueModelClass
* This is a string attribute that defines the class name whose attribute 

*  is to be evaluated or set as a PolicyValue.</br></br>Notes: Not prese 

* nt in the ITU or CIM specs. 

*/
protected String valueModelClass ;


}