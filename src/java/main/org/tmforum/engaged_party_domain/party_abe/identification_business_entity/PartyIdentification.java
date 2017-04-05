/**
* Identification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961B52020F-content.html">Identification ABE</a> 
* The various forms of identification used by individuals and organizati 
* ons, collectively called parties. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.identification_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.DateTime;
import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.engaged_party_domain.party_business_entity.Language;
import org.tmforum.engaged_party_domain.party_business_entity.Organization;

/**
* Party Identification represents our registration of information used a 
* s proof of identity by a Party 
 @since SID_R16.5
*/ 

public abstract class PartyIdentification  {



/**  
* Field language
*/
protected Language language ;




/**  
* Field issuer
*/
protected Organization issuer ;




/**  
* Field issueDate
* The date that the identification was produced / printed 

*/
protected DateTime issueDate ;




/**  
* Field validFor
* The time period that the Party Identification is valid for</br>Note:</ 

* br>The validitity start date may not necessarily equal the issue date  

* (e.g. credit cards are only valid some time after thay are issued)</br 

* ></br>Permitted Values:</br>Refer Time Period class</br> 

*/
protected TimePeriod validFor ;




/**  
* Field scan
* A scan of the identification paper</br></br>Note:</br>May be used to g 

* et a copy of the photo to help in identification 

*/
protected String scan ;


}