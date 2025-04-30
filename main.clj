(require '[datomic.client.api :as d])
(def client (d/client {:server-type :datomic-local
                       :system "datomic-samples"}))
(println (d/list-databases client {}))
