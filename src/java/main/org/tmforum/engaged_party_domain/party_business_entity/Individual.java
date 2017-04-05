/**
* Party ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D812BC602C5-content.html">Party ABE</a> 
* A Party represents an individual or an organization, or an organizatio 
* n unit that are of interest, involved or that provide value directly o 
* r indirectly from an enterprise perspective (Enterprise is to be under 
* stood here as provider, service provider or operator). Hence the Party 
*  plays one or more roles with the enterprise or with another Party pla 
* ying a role with the enterprise (indirectly). This is introduced to sp 
* ecify that the only party an enterprise would be interested in and wil 
* l consider in its systems is a party playing a role (directly or indir 
* ectly). Roles would be represented by the PartyRole concept. Additiona 
* l roles will be defined to cover the needs of the new digital ecosyste 
* m."Examples of roles played by Parties include those:•&nbsp;&nbsp;&nbs 
* p;&nbsp;Of interest, such as competitors, sales prospects •&nbsp;&nbsp 
* ;&nbsp;&nbsp;Involved, such as customers, users, employees•&nbsp;&nbsp 
* ;&nbsp;&nbsp;That provides value directly or indirectly, such as servi 
* ce providers, operators, cloud brokers, infrastructure providers, appl 
* ication developers. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_business_entity ;

/**
* Represents a single human being (a man, woman or child).The individual 
*  could be a customer, an employee or any other person that the organiz 
* ation needs to store information about. An Individual is a type of Par 
* ty. 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party ABE::Party" href="_3E3F0EC000E93C23195B0104-content.html">SID Models::Engaged Party Domain::Party ABE::Party</a> @since SID_R16.5
*/ 

public  class Individual extends Party {



/**  
* Field gender
* A socially constructed role that implies behaviours, activities, and a 

* ttributes. 

*/
protected String gender ;




/**  
* Field placeOfBirth
* Note:</br>Pointer to a Location object</br>City, town name etc.</br> 

*/
protected String placeOfBirth ;




/**  
* Field nationality
* Note:</br>Pointer to a country object 

*/
protected String nationality ;




/**  
* Field maritalStatus
* Permitted Values: married, never married, divorced, widowed 

*/
protected String maritalStatus ;




/**  
* Field skills
* Note:</br>Probably only used for employees, but is really role indepen 

* dent</br>This should be modeled as a separate entity but is shown as a 

* n attribute for brevity</br> 

*/
protected String skills ;




/**  
* Field disabilities
* Notes:  Used for legal requirements (special billing, special products 

* , special contact media, such as Braille). This should be modeled as a 

*  separate entity but is shown as an attribute for brevity. 

*/
protected String disabilities ;




/**  
* Field aliveDuring
* Birth date and death date. 

*/
protected TimePeriod aliveDuring ;




/**  
* Field individualName
*/
protected IndividualName individualName ;




/**  
* Field individualIdentification
*/
protected List<IndividualIdentification> individualIdentification ;




/**  
* Field countryOfBirth
*/
protected Country countryOfBirth ;




/**  
* Field country
*/
protected List<Country> country ;




/**  
* Field languageAbility
*/
protected List<LanguageAbility> languageAbility ;


}