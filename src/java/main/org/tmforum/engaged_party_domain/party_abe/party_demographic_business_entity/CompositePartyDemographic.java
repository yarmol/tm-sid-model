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
* A type of PartyDemographic that is formed by aggregating other PartyDe 
* mographics, which may be Composite or Atomic PartyDemographics. 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party ABE::Party Demographic ABE::PartyDemographic" href="_3E3F0EC000E93C8FAAA90258-content.html">SID Models::Engaged Party Domain::Party ABE::Party Demographic ABE::PartyDemographic</a> @since SID_R16.5
*/ 

public  class CompositePartyDemographic extends PartyDemographic {



/**  
* Field partyDemographic
*/
protected List<PartyDemographic> partyDemographic ;


}