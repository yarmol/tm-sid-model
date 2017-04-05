/**
* Party Demographic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C1905D2007F-content.html">Party Demographic ABE</a> 
* Demographics deal with the study of individuals and organizations (Par 
* ties), including their size, growth, density, and distribution, as wel 
* l as statistics regarding birth, marriage, disease, and death.  Demogr 
* aphic data is information about parties that allows decisions to be ma 
* de such as the make-up and size of a market segment, classification an 
* d ranking of customers, and so forth.  Demographics provide the key “w 
* hat” information and can be broken down into two categories:  individu 
* al demographics and organization demographics. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_demographic_business_entity ;

/**
* A feature or quality used to make recognizable or to define a Party pl 
* aying a PartyRole, such as age, income, education, revenue, and so for 
* th. 
 @since SID_R16.5
*/ 

public abstract class PartyDemographic  {



/**  
* Field ID
* A unique identifier for the PartyDemographic. 

*/
protected String ID ;




/**  
* Field description
* A narrative that explains what the PartyDemographic is. 

*/
protected String description ;




/**  
* Field partyDemographicSource
* The origin of the PartyDemographic. 

*/
protected String partyDemographicSource ;




/**  
* Field dateCreated
* The date on which the PartyDemographic was created. 

*/
protected DateTime dateCreated ;




/**  
* Field validFor
* The period during which the PartyDemographic is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field partyDemographicValue
*/
protected List<PartyDemographicValue> partyDemographicValue ;




/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field compositePartyDemographic
*/
protected List<CompositePartyDemographic> compositePartyDemographic ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;


}