; most the setting is from http://dev.solita.fi/2014/03/18/pimp-my-repl.html
{:user  {:plugins  [[lein-pprint "1.1.1"]]
         :dependencies  [[leiningen #=(leiningen.core.main/leiningen-version)]
                         [slamhound "1.3.1"]
                         [org.clojars.gjahad/debug-repl "0.3.3"]
                         [difform "1.1.2"]
                         [clj-ns-browser "1.3.1"]
                         [org.clojure/tools.namespace "0.2.4"]
                         [im.chit/vinyasa "0.2.0"]
                         [spyscope "0.1.4"]
                         ]
         :injections [(require 'spyscope.core)
                      (require '[vinyasa.inject :as inj])
                      (inj/inject 'clojure.core '> 
                                             '[[vinyasa.inject inject]
                                               [vinyasa.pull pull]
                                               [vinyasa.lein lein]
                                               [vinyasa.reimport reimport]
                                               ]
                                             )
                      ]

         }}
