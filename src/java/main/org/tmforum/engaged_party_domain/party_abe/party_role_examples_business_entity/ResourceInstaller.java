/**
* Party Role Examples ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961B34027A-content.html">Party Role Examples ABE</a> 
* A set of example PartyRoles that a Party may play. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_role_examples_business_entity ;

/**
* An individual who installs PhysicalResources. It specifically doesn't  
* provide all of the capabilities of a Technician role, but also represe 
* nts a less costly PartyRole. Specifically, a ResourceInstaller is limi 
* ted to simple physical installation of Equipment. A ResourceInstaller  
* does not configure Resources or Services. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class ResourceInstaller extends PartyRole {

}