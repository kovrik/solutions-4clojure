; restrictions:
;   map
;   map-indexed
;   mapcat
;   for

(defn my-map [f coll]
  (if-not (empty? coll)
    (cons (f (first coll)) (lazy-seq (my-map f (rest coll))))))

(= [3 4 5 6 7]
   (my-map inc [2 3 4 5 6]))

(= (repeat 10 nil)
   (my-map (fn [_] nil) (range 10)))

(= [1000000 1000001]
   (->> (my-map inc (range))
        (drop (dec 1000000))
        (take 2)))
