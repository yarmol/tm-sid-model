/**
* Policy Value ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C7FB02EE-content.html">Policy Value ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_value_business_entity ;

/**
* This class is used to represent a single string value, or a set of str 
* ing values. Each value can have wildcards. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue" href="_3E3F0EC000E93D77E58C02A7-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class StringValue extends PolicyValue,Policy,RootEntity {



/**  
* Field valueStringList
* This attribute is an array of strings, defined in an unordered list, e 

* ach representing a single string. Any string can have one or more wild 

* cards, denoted with the asterisk character (*). For example, the value 

*  "abc*def*" matches the string "abcxxxdefyz". If the asterisk characte 

* r is required as part of the string value itself, it must be escaped w 

* ith quotes (").</br> 

*/
protected String valueStringList ;


}