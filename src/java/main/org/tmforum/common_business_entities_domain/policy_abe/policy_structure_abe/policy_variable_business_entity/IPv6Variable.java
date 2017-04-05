/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This class represents using the value of IPv6 source and/or destinatio 
* n addresses as part of a condition expression. Thus, only IPv6AddressV 
* alue classes can be used in the value portion of the condition express 
* ion with this PolicyVariable. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class IPv6Variable extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field v6AddressList
* This attribute is an unordered list of strings, each specifying a</br> 

* single IPv6 address, a hostname, or a range of IPv6 addresses, accordi 

* ng to the ABNF definition of an IPv6 address as specified below:</br>< 

* /br> IPv6address = hexpart [ ":" IPv4address ]</br> IPv4address = 1*3D 

* IGIT "." 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT</br> IPv6prefix = hexpart  

* "/" 1*2DIGIT</br> hexpart = hexseq | hexseq "::" [ hexseq ] | "::" [ h 

* exseq ]</br> hexseq = hex4 *( ":" hex4)</br> hex4 = 1*4HEXDIG</br> IPv 

* 6range = IPv6address"-"IPv6address</br> IPv6maskedaddress = IPv6addres 

* s","IPv6address</br></br>Hostnames are defined in RFC1035.</br></br>In 

*  the above definition, each string entry is either:</br></br> 1. A sin 

* gle IPv6address in dot notation as defined above.</br></br> 2. A singl 

* e Hostname. Hostname format follows the guidelines </br> and restricti 

* ons specified in RFC1035.</br></br> 3. An IPv6range address range defi 

* ned above, specified by a </br> start address in dot notation and an e 

* nd address in dot </br> notation, separated by "-". The range includes 

*  all addresses </br> between the range's start and end addresses, incl 

* uding the </br> start and end addresses.</br></br> 4. An IPv6maskedadd 

* ress address range defined above,</br> specified by an address and mas 

* k. The address and mask </br> are represented in dot notation separate 

* d by a comma ",".</br> </br> 5. An IPv6prefix address range defined ab 

* ove specified by an </br> address and a prefix length separated by "/" 

* .</br></br> 

*/
protected String v6AddressList ;




/**  
* Field v6Direction
* This is an enumerated integer that defines if this variable is used to 

*  represent source addresses, destination addresses, or both. 

*/
protected Integer v6Direction ;




/**  
* Field v6HeaderNumber
* This attribute is an enumerated integer that defines the particular pa 

* cket header that contains the IPv6 address information. Specifying the 

*  packet header is necessary in case the address is tunneled. In this c 

* ase, it is mandatory that the correct address be chosen for comparison 

* . Values are:</br></br> 0: outermost header</br> 1: next innermost hea 

* der</br> 2: second innermost header</br></br>etc.</br> 

*/
protected Integer v6HeaderNumber ;


}