; restrictions: interpose

(defn interp [c coll]
  (rest (mapcat (fn [e] [c e]) coll)))

(fn [c coll] (rest (mapcat (fn [e] [c e]) coll)))

(= (interp 0 [1 2 3]) [1 0 2 0 3])

(= (apply str (interp ", " ["one" "two" "three"])) "one, two, three")

(= (interp :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
