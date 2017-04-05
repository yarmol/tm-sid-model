/**
* Identification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961B52020F-content.html">Identification ABE</a> 
* The various forms of identification used by individuals and organizati 
* ons, collectively called parties. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.identification_business_entity ;

/**
* A permit, such as one issued by a state's motor vehicle bureau, that a 
* llows the holder to drive a motor vehicle on public roads. 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party ABE::Identification ABE::IndividualIdentification" href="_3E3F0EC000E93DFFBBDD009E-content.html">SID Models::Engaged Party Domain::Party ABE::Identification ABE::IndividualIdentification</a> |- 
 <a title="SID Models::Engaged Party Domain::Party ABE::Identification ABE::PartyIdentification" href="_3E3F0EC000E93DFFBBD100C9-content.html">SID Models::Engaged Party Domain::Party ABE::Identification ABE::PartyIdentification</a> @since SID_R16.5
*/ 

public  class DriversLicenseIdentification extends IndividualIdentification,PartyIdentification {



/**  
* Field licenseNr
* A number assigned to a driver's license used to identify it. 

*/
protected String licenseNr ;


}