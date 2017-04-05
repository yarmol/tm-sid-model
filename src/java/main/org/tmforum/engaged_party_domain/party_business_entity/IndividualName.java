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
* A word, term, or phrase by which an individual is known and distinguis 
* hed from other individuals.A name is an informal way of identifying an 
*  object [Fowler]This entity allows for international naming variations 
* . An IndividualName is a type of PartyName. 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party ABE::PartyName" href="_3E3F0EC000E93C310FDE00F9-content.html">SID Models::Engaged Party Domain::Party ABE::PartyName</a> @since SID_R16.5
*/ 

public  class IndividualName extends PartyName {



/**  
* Field formattedName
* Contains, in one string, a fully formatted name with all of its pieces 

*  in their proper place. This includes all of the necessary punctuation 

* . This de-normalized form of the name cannot be easily parsed.</br></b 

* r>Note:</br>if NULL, then derive from the other fields using name poli 

* cy 

*/
protected String formattedName ;




/**  
* Field legalName
* Contains, in one string, a fully formatted name with all of its pieces 

*  in their proper place. This includes all of the necessary punctuation 

* </br></br>Note:</br>if NULL, then derive from the other fields using n 

* ame policy 

*/
protected String legalName ;




/**  
* Field aristocraticTitle
* A name that describes someone's aristocratic position, such as Baron,  

* Graf, Earl, and so forth.</br> 

*/
protected String aristocraticTitle ;




/**  
* Field formOfAddress
* Contains the Salutation,e.g. Mr., Mrs., Hon., Dr.,Major, etc</br></br> 

* Note:</br>Also known as person title</br>Also includes. Miss, Ms, </br 

* > 

*/
protected String formOfAddress ;




/**  
* Field generation
* An abbreviation or word that pertains to the generation in a family hi 

* story, such as Sr., Jr., III (the third), and so forth. 

*/
protected String generation ;




/**  
* Field givenNames
* Note:</br>Also known as Christian name, chosen name, first name </br>M 

* ultiple fields may be entered with a delimiter in-between or stored in 

*  a collection</br> 

*/
protected String givenNames ;




/**  
* Field preferredGivenName
* Contains the chosen name by which the person prefers to be addressed.  

* Note: This name may be a name other than a given name, such as a nickn 

* ame 

*/
protected String preferredGivenName ;




/**  
* Field middleNames
* Middle name(s) or initial(s)</br>Note:</br>Multiple fields may be ente 

* red with a delimiter in-between or stored in a collection 

*/
protected String middleNames ;




/**  
* Field familyNamePrefix
* Notes:</br>e.g. Van den, Von etc. 

*/
protected String familyNamePrefix ;




/**  
* Field familyNames
* Contains the non-chosen or inherited name. Also known as a person's la 

* st name in the Western context.</br></br>Notes:</br>Also known as surn 

* ame </br>Multiple fields may be entered with a delimiter in-between</b 

* r> 

*/
protected String familyNames ;




/**  
* Field familyGeneration
* An abbreviation or word that pertains to the generation in a family, s 

* uch Sr, Jr. 

*/
protected String familyGeneration ;




/**  
* Field qualifications
* Contains the letters used to describe academic or other type qualifica 

* tions held by a person and/or the distinctions conferred upon them. e. 

* g. PhD, MD, CPA, MCSD, etc</br></br>Note:</br>also known as orders, de 

* corations, honors, awards and distinctions 

*/
protected String qualifications ;




/**  
* Field individual
*/
protected Individual individual ;


}