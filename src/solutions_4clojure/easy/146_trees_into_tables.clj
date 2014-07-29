; 146 - Trees Into Tables
(defn tree-into-table [m]
  (let [pairs (for [k1 (keys m)
                    k2 (keys (m k1))
                    :let [pair (conj [] k1 k2)
                          value ((m k1) k2)]]
                (conj [] pair value))]
    (into {} pairs)))

(= (tree-into-table '{a {p 1, q 2}
                      b {m 3, n 4}})
   '{[a p] 1, [a q] 2
     [b m] 3, [b n] 4})

(= (tree-into-table '{[1] {a b c d}
                      [2] {q r s t u v w x}})
   '{[[1] a] b, [[1] c] d,
     [[2] q] r, [[2] s] t,
     [[2] u] v, [[2] w] x})

(= (tree-into-table '{m {1 [a b c] 3 nil}})
                    '{[m 1] [a b c], [m 3] nil})