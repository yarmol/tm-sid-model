/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This class is used to represent a single or set of DistinguishedName v 
* ariable, which may include wildcards. This variable type is specifical 
* ly defined for retrieving LDAP-based data. Thus, only DNValue classes  
* can be used in the value portion of the condition expression with this 
*  PolicyVariable. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class DNVariable extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field variableDNList
* This attribute provides an unordered list of strings, each representin 

* g a Distinguished Name (DN) with wildcards. The asterisk character ("* 

* ") is used as wildcard for either a single attribute value or a wildca 

* rd for an RDN.</br> 

*/
protected String variableDNList ;


}