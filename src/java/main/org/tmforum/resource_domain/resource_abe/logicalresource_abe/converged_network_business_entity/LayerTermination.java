/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* The LayerTermination_ (LT) encapsulates the functions and points assoc 
* iated with one instance of a layer. The functions include the adapter  
* functions, the termination functions and the connection points of that 
*  layer. In this case the term layer is essentially synonymous with the 
*  term protocol as use by other standards. All functions encapsulated h 
* ave the same signal granularity, closely associated characteristic typ 
* e and essential rate. A specific LayerTermination may be equipped with 
*  a subset of capabilities. Where the TPE is semi-transparent the layer 
* s encapsulated by a TPE are exposed by the LayerTermination_ set that  
* it contains.The LayerTermination_ provides the relevant layer paramete 
* rs for the semi-transparent TPE cases.The LayerTermination_ allows for 
*  detailed layer description of a TPE (potentially representing a port) 
*  and for precise association of the TPE with a TopologicalLink_ (or ot 
* her representatives of forwarding relationship). 
 @since SID_R16.5
*/ 

public  class LayerTermination  {



/**  
* Field layerProtocolNameList
* Each instance provides the name and potentially additional information 

*  such as version number for the protocol(s)/layer(s) supported by the  

* LT. Syntax and semantic to be specified.</br></br>Note: allowed value  

* examples: “X2”, “LR Optical Channel”. 

*/
protected String layerProtocolNameList ;




/**  
* Field direction
* This attribute represents the flow of traffic within the LT. 

*/
protected Direction direction ;




/**  
* Field ltType
* The name of the specification that describes the internal construction 

*  of the LT, indicating for example that it possesses a G.805 CP but no 

*  G.805 TCP&nbsp;(see&nbsp;MTNM/MTOSI&nbsp;SD1-18). 

*/
protected String ltType ;




/**  
* Field index
* Provides any relevant indexing of the LT (channel number, e.g. ‘3’). 

*/
protected String index ;




/**  
* Field networkAddressList
* Pulls in the list of addresses relevant to the LT. 

*/
protected List<NetworkAddress> networkAddressList ;




/**  
* Field forwardingState
* Indicates whether The LT within a TPE is involved in forwarding traffi 

* c to/from LTs in other TPEs or not. This forwarding is described by th 

* e associated FREs and hence this attribute indicates whether there are 

*  any associated FREs or not.  In any particular case the values that t 

* his attribute may take are constrained by the value of the "direction" 

*  attribute of the LT. There is also a dependency on the value of the " 

* terminationState" attribute of the LT.  

*/
protected LtForwardingState forwardingState ;




/**  
* Field terminationState
* The LT represents an encapsulation and aggregation of associated G.805 

*  TCPs, G.805 Termination Functions and G.805 CPs. The terminationState 

*  attribute indicates and controls the configuration of signal flow wit 

* hin the LT indicating whether and how the signal is flowing between th 

* e G.805 TCP and the G.805 CP in the LT. There is a dependency on the v 

* alue of the "forwardingState" attribute of the LT. 

*/
protected TerminationMode terminationState ;




/**  
* Field transmissionParameterList
* A list of specific parameters related to the LayerTermination.  

*/
protected List<AttributeValuePair> transmissionParameterList ;




/**  
* Field encapsulatedTmt
* Pulls in the TrafficMappingTable related to the LT. 

*/
protected TrafficMappingTable encapsulatedTmt ;




/**  
* Field thisLayerActive
* Indicates that the LT is active in the stack of layers of the encapsul 

* ating TPE. 

*/
protected Boolean thisLayerActive ;


}