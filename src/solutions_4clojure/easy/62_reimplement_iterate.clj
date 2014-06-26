; restrictions: iterate

(defn itrt [f v]
 (lazy-cat [v] (itrt f (f v))))

(= (take 5   (itrt #(* 2 %) 1)) [1 2 4 8 16])

(= (take 100 (itrt inc 0)) (take 100 (range)))

(= (take 9   (itrt #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))
