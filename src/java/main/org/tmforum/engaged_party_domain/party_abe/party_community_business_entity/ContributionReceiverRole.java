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
* A ContributioReceiverRole is a BusinessInteractionRole a party (identi 
* fied by a Community) plays when receiving a contribution from a Commun 
* ityMember. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionRole @since SID_R16.5
*/ 

public  class ContributionReceiverRole extends BusinessInteractionRole {



/**  
* Field community
*/
protected Community community ;


}