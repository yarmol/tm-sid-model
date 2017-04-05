/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This class represents using the value of IPv4 source and/or destinatio 
* n addresses as part of a condition expression. Thus, only IPv4AddressV 
* alue classes can be used in the value portion of the condition express 
* ion with this PolicyVariable. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class IPv4Variable extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field www.bigcompany.com
* This attribute is an unordered list of strings, each specifying a</br> 

* single IPv4 address, a hostname, or a range of IPv4 addresses, accordi 

* ng to the ABNF definition of an IPv4 address as specified below:</br>< 

* /br> IPv4address = 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT</br 

* > IPv4prefix = IPv4address "/" 1*2DIGIT</br> IPv4range = IPv4address"- 

* "IPv4address</br> IPv4maskedaddress = IPv4address","IPv4address</br></ 

* br>Hostnames are defined in RFC1035.</br></br>In the above definition, 

*  each string entry is either:</br></br> 1. A single Ipv4address in dot 

*  notation as defined above.</br> Example: 121.1.1.2</br></br> 2. A sin 

* gle Hostname. Hostname format follows the guidelines </br> and restric 

* tions specified in RFC1035.</br> Example: <a target="_self" href="http 

* ://www.bigcompany.com">www.bigcompany.com</a></br></br> 3. An IPv4rang 

* e address range defined above, specified by a </br> start address in d 

* ot notation and an end address in dot </br> notation, separated by "-" 

* . The range includes all addresses </br> between the range's start and 

*  end addresses, including the </br> start and end addresses.</br> Exam 

* ple: 1.1.22.1-1.1.22.5</br></br> 4. An IPv4maskedaddress address range 

*  defined above,</br> specified by an address and mask. The address and 

*  mask </br> are represented in dot notation separated by a comma ",".< 

* /br> Example: 2.3.128.0,255.255.248.0.</br> </br> 5. An IPv4prefix add 

* ress range defined above specified by an </br> address and a prefix le 

* ngth separated by "/".</br> Example: 2.3.128.0/15</br></br> 

*/
protected String www.bigcompany.com ;




/**  
* Field v4Direction
* This is an enumerated integer that defines if this variable is used to 

*  represent source addresses, destination addresses, or both. Values ar 

* e:</br></br> 0: source addresses</br> 1: destination addresses</br> 2: 

*  both</br> 

*/
protected Integer v4Direction ;




/**  
* Field v4HeaderNumber
* This attribute is an enumerated integer that defines the particular pa 

* cket header that contains the IPv4 address information. Specifying the 

*  packet header is necessary in case the address is tunneled. In this c 

* ase, it is mandatory that the correct address be chosen for comparison 

* . Values are:</br></br> 0: outermost header</br> 1: next innermost hea 

* der</br> 2: second innermost header</br></br>etc.</br> 

*/
protected Integer v4HeaderNumber ;


}