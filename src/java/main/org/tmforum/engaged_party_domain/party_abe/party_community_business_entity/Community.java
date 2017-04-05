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
* A Community is a PartyRole, played by an Organization. CommunityMember 
* s can commit to a Community, contribute Contributions to the Community 
*  and consume Assets from a Community. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class Community extends PartyRole {



/**  
* Field partyRole
*/
protected List<CommitmentProcurementRole> partyRole ;




/**  
* Field contributionReceiverRole
*/
protected ContributionReceiverRole contributionReceiverRole ;




/**  
* Field assetProviderRole
*/
protected List<AssetProviderRole> assetProviderRole ;




/**  
* Field description
* A short description of the purpose of the community 

*/
protected String description ;




/**  
* Field nbrOfMembers
* The number of members committed to the community 

*/
protected UnlimitedNatural nbrOfMembers ;




/**  
* Field totalAssets
* Total number of assets provided to the Community. 

*/
protected UnlimitedNatural totalAssets ;




/**  
* Field sourcedAssets
* Number of assets sourced from the Community 

*/
protected UnlimitedNatural sourcedAssets ;


}