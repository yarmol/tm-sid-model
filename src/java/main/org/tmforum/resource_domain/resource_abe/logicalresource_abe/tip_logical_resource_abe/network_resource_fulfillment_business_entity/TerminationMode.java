/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* The CTP can be mapped but currently is not (i.e., it does have contain 
* ed potential CTPs, but currently has no contained actual CTPs). This i 
* ndicates that the G.805 CP aggregated in the CTP is not connected to a 
*  TCP (that would be aggregated in the same CTP) and therefore the CTP  
* is available for SNC/crossconnect connectivity (e.g. STS1 not terminat 
* ed and not mapped to VT1.5i.e. not channelized).The FTP can be mapped  
* on the server side but currently is not (i.e., it does have contained  
* potential CTPs on the server side, but currently has no contained actu 
* al CTPs on the server side). This indicates that the FTP supports IM ( 
* Inverse Multiplexing) but the IM function is not active and the TCP wi 
* thin the FTP is available for external SNC/crossconnect connectivity. 
 @since SID_R16.5
*/ 

public  enum TerminationMode  {



/**  
* Field NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING
* The CTP can be mapped but currently is not (i.e., it does have contain 

* ed potential CTPs, but currently has no contained actual CTPs). This i 

* ndicates that the G.805 CP aggregated in the CTP is not connected to a 

*  TCP (that would be aggregated in the same CTP) and therefore the CTP  

* is available for SNC/crossconnect connectivity (e.g. STS1 not terminat 

* ed and not mapped to VT1.5i.e. not channelized).The FTP can be mapped  

* on the server side but currently is not (i.e., it does have contained  

* potential CTPs on the server side, but currently has no contained actu 

* al CTPs on the server side). This indicates that the FTP supports IM ( 

* Inverse Multiplexing) but the IM function is not active and the TCP wi 

* thin the FTP is available for external SNC/crossconnect connectivity. 

*/
 NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING ,




/**  
* Field NOT_APPLICABLE
* The CTP can not be mapped (i.e., it has no contained potential CTPs).  

* This indicates that an SNC/crossconnect can be used to connect the G.8 

* 05 TCP of the CTP to the connection point of another CTP/FTP. This onl 

* y applies to CTPs that connect on their server side and are related to 

*  the containing PTP/FTP on their client side.The FTP can not be mapped 

*  on the server side (i.e., it has no contained potential CTPs on the s 

* erver side). This indicates that an SNC/crossconnect can be used to co 

* nnect the G.805 TCP of the FTP to the connection point of another CTP/ 

* FTP. This only applies to FTPs that connect on their server side and d 

* o not support IM (Inverse Multiplexing). 

*/
 NOT_APPLICABLE ,




/**  
* Field TERMINATED_AND_AVAILABLE_FOR_MAPPING
* The CTP can be mapped and currently is (i.e., it has contained actual  

* CTPs). This indicates that the G.805 CPs adapted from the correspondin 

* g G.805 Termination Function within the CTP aggregate are available to 

*  provide client layer capacity (e.g. STS1 terminated and mapped to VT1 

* .5 i.e. channelized). In this state the TCP will be sourcing and sinki 

* ng traffic. This is only a valid value for CTPs that support client ad 

* aptation.The FTP can be mapped on the server side and currently is (i. 

* e., it has contained actual CTPs on the server side). This indicates t 

* hat the FTP supports IM (Inverse Multiplexing) and the server side con 

* tained CTPs (if any) are available for connection as the FTP is active 

* ly assembling the fragments of the IM. This value is not valid for an  

* FTP that does not support IM. (see layering for more details).For ATM  

* VP or VC CTP this value is used to model a VPC or a VCC terminating wi 

* thin the Managed Element (i.e. internal VP or VC Trails). Such a termi 

* nated ATM connection is used as a trail acting as a server for upper l 

* ayer protocols (e.g., VCCs in case of a VPC TP,Frame Relay in case of  

* a VCC TP). In the two switching layer ATM model, the VP layer acts as  

* the infrastructure on which VC Connections (either PVC, SPVC or SVC) a 

* re routed and switched. This capability allows the operator to build a 

*  logical partitioning (VP overlay) of the physical ATM network by conf 

* iguring VPCs (or VP "tunnels") which are terminated inside the subnetw 

* ork. Such overlay VP network allows operators to aggregate and segrega 

* te VCs according to their traffic management policy. In addition, the  

* use of an intra-subnetwork VPC may provide for enhanced protection of  

* the VC traffic by using 1+1 VP protection (VP protection is not suppor 

* ted in this release of the EMS-NMS interface). In order to be able to  

* make routing decisions at VC level (e.g., explicit route constraint),  

* the NMS needs to know the VP topology available from the ATM network. 

*/
 TERMINATED_AND_AVAILABLE_FOR_MAPPING ,




/**  
* Field NULL
*/
 NULL ,


}