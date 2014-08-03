(defn pt [v]
  (letfn [(next-row [row] (let [indices (cons -1 (range (inc (count row))))]
                            (vec (map #(reduce +' %) (partition 2 1 (map #(get row % 0) indices))))))]
    (iterate next-row v)))

(= (second (pt [2 3 2])) [2 5 5 2])

(= (take 5 (pt [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])

(= (take 2 (pt [3 1 2])) [[3 1 2] [3 4 3 2]])

(= (take 100 (pt [2 4 2])) (rest (take 101 (pt [2 2]))))