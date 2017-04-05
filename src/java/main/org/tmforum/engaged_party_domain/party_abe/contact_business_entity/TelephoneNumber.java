/**
* Contact ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961BF801B3-content.html">Contact ABE</a> 
* The various means by which a PartyRole or PartyAccount/CustomerAccount 
* Contact can be reached, such as by telephone, fax, email. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.contact_business_entity ;

/**
* A number and type of number assigned to a particular telephone and use 
* d in making connections to it. 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party ABE::Contact ABE::ContactMedium" href="_3E3F0EC000E93C23250A0154-content.html">SID Models::Engaged Party Domain::Party ABE::Contact ABE::ContactMedium</a> @since SID_R16.5
*/ 

public  class TelephoneNumber extends ContactMedium {



/**  
* Field number
* A number assigned to a particular telephone and used in making connect 

* ions to it. 

*/
protected String number ;




/**  
* Field type
* The kind of telephone number, such as mobile, home, office. 

*/
protected String type ;


}