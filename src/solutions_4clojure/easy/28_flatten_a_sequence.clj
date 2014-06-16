; restrictions: flatten

(defn fltn [coll]
  (mapcat  #(if (sequential? %) (fltn %) [%]) coll))

(= (fltn '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (fltn ["a" ["b"] "c"]) '("a" "b" "c"))

(= (fltn '((((:a))))) '(:a))
