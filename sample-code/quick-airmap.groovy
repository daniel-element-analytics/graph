graph=TinkerGraph.open()
g=graph.traversal()
g.addV(label,'airport','code','AUS').as('aus').
  addV(label,'airport','code','DFW').as('dfw').
  addV(label,'airport','code','LAX').as('lax').
  addV(label,'airport','code','JFK').as('jfk').
  addV(label,'airport','code','ATL').as('atl').
  addE('route').from('aus').to('dfw').
  addE('route').from('aus').to('atl').
  addE('route').from('atl').to('dfw').
  addE('route').from('atl').to('jfk').
  addE('route').from('dfw').to('jfk').
  addE('route').from('dfw').to('lax').
  addE('route').from('lax').to('jfk').
  addE('route').from('lax').to('aus').
  addE('route').from('lax').to('dfw')
                                                 
g.V().valueMap(true)
g.V().outE().inV().path().by('code').by()
