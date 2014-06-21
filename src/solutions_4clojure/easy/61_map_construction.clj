; restrictions: zipmap

(defn zm [ks vs]
  (apply merge (map (fn [k v] (hash-map k v)) ks vs)))


(= (zm [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})

(= (zm [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})

(= (zm [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
