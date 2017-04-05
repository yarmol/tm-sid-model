/**
* Contact ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961BF801B3-content.html">Contact ABE</a> 
* The various means by which a PartyRole or PartyAccount/CustomerAccount 
* Contact can be reached, such as by telephone, fax, email. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.contact_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity.AbstractGeographicAddress;
import org.tmforum.common_business_entities_domain.location_abe.geographic_place_abe.geographic_address_business_entity.PostalDeliveryAddress;
import org.tmforum.customer_domain.customer_business_entity.CustomerAccountContact;
import org.tmforum.engaged_party_domain.additional_party_entities_business_entity.PartyAccountContact;
import org.tmforum.engaged_party_domain.party_business_entity.Party;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;

import java.util.List;

/**
* A means by which communication may be established with a party (indivi 
* dual or organization).Contact Medium is an abstract concept that shoul 
* d be subclassed as required. 
 @since SID_R16.5
*/ 

public abstract class ContactMedium  {



/**  
* Field abstractGeographicAddress
*/
protected AbstractGeographicAddress abstractGeographicAddress ;




/**  
* Field postalDeliveryAddress
*/
protected PostalDeliveryAddress postalDeliveryAddress ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field validFor
* The time period that the Contact Medium is valid for. 

*/
protected TimePeriod validFor ;




/**  
* Field customerAccountContact
*/
protected List<CustomerAccountContact> customerAccountContact ;




/**  
* Field partyAccountContact
*/
protected List<PartyAccountContact> partyAccountContact ;




/**  
* Field party
*/
protected List<Party> party ;


}