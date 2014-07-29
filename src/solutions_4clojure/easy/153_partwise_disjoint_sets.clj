(defn pds [s]
  (let [uc (count (reduce clojure.set/union s))
        oc (reduce + (map count s))]
    (= uc oc)))


(= (pds #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}}) true)

(= (pds #{#{:a :b :c :d :e}
          #{:a :b :c :d}
          #{:a :b :c}
          #{:a :b}
          #{:a}})
   false)

(= (pds #{#{[1 2 3] [4 5]}
          #{[1 2] [3 4 5]}
          #{[1] [2] 3 4 5}
          #{1 2 [3 4] [5]}})
   true)

(= (pds #{#{'a 'b}
          #{'c 'd 'e}
          #{'f 'g 'h 'i}
          #{''a ''c ''f}})
   true)

(= (pds #{#{'(:x :y :z) '(:x :y) '(:z) '()}
          #{#{:x :y :z} #{:x :y} #{:z} #{}}
          #{'[:x :y :z] [:x :y] [:z] [] {}}})
   false)

(= (pds #{#{(= "true") false}
          #{:yes :no}
          #{(class 1) 0}
          #{(symbol "true") 'false}
          #{(keyword "yes") ::no}
          #{(class '1) (int \0)}})
   false)

(= (pds #{#{distinct?}
          #{#(-> %) #(-> %)}
          #{#(-> %) #(-> %) #(-> %)}
          #{#(-> %) #(-> %) #(-> %)}})
   true)

(= (pds #{#{(#(-> *)) + (quote mapcat) #_ nil}
          #{'+ '* mapcat (comment mapcat)}
          #{(do) set contains? nil?}
          #{, , , #_, , empty?}})
   false)