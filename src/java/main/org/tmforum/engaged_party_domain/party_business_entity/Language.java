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
* Represents a spoken and/or written language. 
 @since SID_R16.5
*/ 

public  class Language  {



/**  
* Field geographicLocationName
*/
protected List<GeographicLocationName> geographicLocationName ;




/**  
* Field partyIdentification
*/
protected List<PartyIdentification> partyIdentification ;




/**  
* Field alphabetName
* The alphabet name use for the language</br></br>Note:</br>ISO standard 

*  ? 

*/
protected String alphabetName ;




/**  
* Field dialectNames
* A list of the dialects of the language</br></br>Note:</br>ISO standard 

*  ? 

*/
protected String dialectNames ;




/**  
* Field languageAbility
*/
protected List<LanguageAbility> languageAbility ;




/**  
* Field partyName
*/
protected List<PartyName> partyName ;




/**  
* Field country
*/
protected Country country ;




/**  
* Field calendarEntry
*/
protected List<CalendarEntry> calendarEntry ;




/**  
* Field calendar
*/
protected List<Calendar> calendar ;




/**  
* Field softwareResourceSpec
*/
protected List<SoftwareResourceSpecification> softwareResourceSpec ;




/**  
* Field currencyName
*/
protected List<CurrencyName> currencyName ;




/**  
* Field currencyUnitName
*/
protected List<CurrencyUnitName> currencyUnitName ;




/**  
* Field organization
*/
protected List<Organization> organization ;


}