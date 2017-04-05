/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This class is used to represent a single or set of string variable. Ea 
* ch can have wildcards. Thus, only StringValue classes can be used in t 
* he value portion of the condition expression with this PolicyVariable. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class StringVariable extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field variableStringList
* This attribute is an unordered list of strings, each representing </br 

* >a single string with wildcards. The asterisk character "*" is used as 

*  a wildcard, and represents an arbitrary sub-string replacement. For e 

* xample, the value "abc*def" match "abcxyzdef", and the value "abc*def* 

* " match "abcxxxdefyyyzzz".</br> 

*/
protected String variableStringList ;


}