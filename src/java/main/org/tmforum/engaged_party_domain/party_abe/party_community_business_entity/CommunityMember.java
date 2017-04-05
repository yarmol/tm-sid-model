/**
* Party Community ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.qGWB.oAW.qE.eK.o3.d3.fUX.cB.yQ-content.html">Party Community ABE</a> 
* The Party Community ABE is composed of a Community, which is a PartyRo 
* le played by an Organization, CommunityMembers who can commit to a Com 
* munity, make Contributions to the Community and consume Assets from a  
* Community. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_community_business_entity ;

/**
* A CommunityMember is a PartyRole, played by an Individual, who is comm 
* itting to a Community, contributes to it and consumed Assets from the  
* Community. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class CommunityMember extends PartyRole {



/**  
* Field commitmentFulfilmentRole
*/
protected List<CommitmentFulfilmentRole> commitmentFulfilmentRole ;




/**  
* Field contributionProviderRole
*/
protected ContributionProviderRole contributionProviderRole ;




/**  
* Field assetConsumerRole
*/
protected List<AssetConsumerRole> assetConsumerRole ;




/**  
* Field dateJoined
* The initial date of committing to the community 

*/
protected UnlimitedNatural dateJoined ;




/**  
* Field nbrRelatedMembers
* Number of associated CommunityMembers 

*/
protected Object nbrRelatedMembers ;




/**  
* Field nbrContributions
* Number of assets provided to the Community 

*/
protected Object nbrContributions ;




/**  
* Field nbrConsumedAssets
* Number of assets consumed from the Community 

*/
protected Object nbrConsumedAssets ;


}